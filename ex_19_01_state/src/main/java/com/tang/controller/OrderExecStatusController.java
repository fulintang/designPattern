package com.tang.controller;

import com.tang.enums.PayStatus;
import com.tang.service.OrderService;
import com.tang.utils.ResultUtils;
import com.tang.vo.Result;

public class OrderExecStatusController {

    public Result<Object> execStatus(String activityId, Enum<PayStatus> beforeStatus, Enum<PayStatus> afterStatus) {

        // 未支付 -> 已支付 | 交易关闭
        if (PayStatus.NOT_PAID.equals(beforeStatus)) {
            if (PayStatus.HAVE_PAID.equals(afterStatus) || PayStatus.CLOSED.equals(afterStatus)) {
                OrderService.execStatus(activityId, beforeStatus, afterStatus);
                return ResultUtils.OK();
            }
        }

        // 已支付 -> 交易结束 | 全额退款
        if (PayStatus.HAVE_PAID.equals(beforeStatus)) {
            if (PayStatus.END.equals(afterStatus) || PayStatus.REFUND.equals(afterStatus)) {
                OrderService.execStatus(activityId, beforeStatus, afterStatus);
                return ResultUtils.OK();
            }
        }

        return ResultUtils.ERROR();
    }

}

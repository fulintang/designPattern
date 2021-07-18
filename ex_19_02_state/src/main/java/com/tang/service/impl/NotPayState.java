package com.tang.service.impl;

import com.tang.enums.PayStatus;
import com.tang.service.OrderService;
import com.tang.service.State;
import com.tang.utils.ResultUtils;
import com.tang.vo.Result;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotPayState<T> extends State<T> {

    @Override
    public Result<T> pay(String orderId, Enum<PayStatus> beforeStatus) {
        OrderService.execStatus(orderId, beforeStatus, PayStatus.HAVE_PAID);
        return (Result<T>) ResultUtils.OK();
    }

    @Override
    public Result<T> close(String orderId, Enum<PayStatus> beforeStatus) {
        OrderService.execStatus(orderId, beforeStatus, PayStatus.CLOSED);
        return (Result<T>) ResultUtils.OK();
    }

    @Override
    public Result<T> end(String orderId, Enum<PayStatus> beforeStatus) {
        log.info("end");
        return (Result<T>) ResultUtils.ERROR();
    }

    @Override
    public Result<T> refund(String orderId, Enum<PayStatus> beforeStatus) {
        return (Result<T>) ResultUtils.ERROR();
    }

}

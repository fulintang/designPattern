package com.tang.controller;

import com.tang.enums.PayStatus;
import com.tang.service.OrderService;
import com.tang.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class OrderExecStatusControllerTest {

    @Test
    public void test() {
        String orderId = "PARK0000001";
        OrderService.init(orderId, PayStatus.NOT_PAID);

        OrderExecStatusController orderExecStatusController = new OrderExecStatusController();
        Result<Object> objectResult = orderExecStatusController.execStatus(orderId, PayStatus.NOT_PAID, PayStatus.END);
        log.info("测试结果（未支付 -> 订单结束）{}", objectResult);

        Result<Object> objectResult1 = orderExecStatusController.execStatus(orderId, PayStatus.NOT_PAID, PayStatus.HAVE_PAID);
        log.info("测试结果（未支付 -> 已支付）{}", objectResult1);

    }

}

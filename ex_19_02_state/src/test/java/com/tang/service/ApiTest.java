package com.tang.service;

import com.tang.enums.PayStatus;
import com.tang.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    StateHandler stateHandler = new StateHandler();

    @Test
    public void test() {

        String orderId = "PARK0000001";
        OrderService.init(orderId, PayStatus.NOT_PAID);

        Result<Object> end = stateHandler.end(orderId, PayStatus.NOT_PAID);
        log.info("测试结果{}", end);

        Result<Object> pay = stateHandler.pay(orderId, PayStatus.NOT_PAID);
        log.info("测试结果{}", pay);

    }

}

package com.tang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

@Slf4j
public class ApiTest {

    @Test
    public void testPay() {
        PayController payController = new PayController();
        log.info("模拟测试场景：微信支付、人脸方式。");
        payController.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        log.info("模拟测试场景：支付宝支付，指纹方式。");
        payController.doPay("jlu19dlxo111", "100000109894", new BigDecimal(100), 2, 3);
    }

}

package com.tang.channel.impl;

import com.tang.channel.Pay;
import com.tang.model.IPayModel;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class WxPay extends Pay {

    public WxPay(IPayModel payModel) {
        super(payModel);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        log.info("模拟微信渠道支付划账开始。uId: {}, tradeId: {}, amount: {}", uId, tradeId, amount);
        boolean security = payModel.security(uId);
        log.info("模拟微信渠道支付风控校验。uId: {}, tradeId: {}, security: {}", uId, tradeId, security);
        if (!security) {
            log.info("模拟微信渠道支付划账拦截。uId: {}, tradeId: {}, amount: {}", uId, tradeId, amount);
            return "0001";
        }
        log.info("模拟微信渠道支付划账成功。uId: {}, tradeId: {}, amount: {}", uId, tradeId, amount);
        return "0000";
    }

}

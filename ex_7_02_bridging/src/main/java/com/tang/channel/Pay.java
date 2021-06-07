package com.tang.channel;

import com.tang.model.IPayModel;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 在这个类中定义了支付方式的需要实现的划账接口：transfer，以及桥接接口；IPayMode，
 * 并在构造函数中用户方自行选择支付方式。
 * 如果没有接触过此类实现，可以重点关注 IPayMode payMode，这部分是桥接的核心。
 */
@Slf4j
public abstract class Pay {

    protected IPayModel payModel;

    public Pay(IPayModel payModel) {
        this.payModel = payModel;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}

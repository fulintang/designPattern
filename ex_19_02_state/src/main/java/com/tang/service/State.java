package com.tang.service;

import com.tang.enums.PayStatus;
import com.tang.vo.Result;

public abstract class State<T> {

    /**
     * 支付订单
     *
     * @param orderId      订单ID
     * @param beforeStatus 原状态
     * @return 操作结果
     */
    public abstract Result<T> pay(String orderId, Enum<PayStatus> beforeStatus);

    /**
     * 关闭订单
     *
     * @param orderId      订单ID
     * @param beforeStatus 原状态
     * @return 操作结果
     */
    public abstract Result<T> close(String orderId, Enum<PayStatus> beforeStatus);

    /**
     * 订单完成
     *
     * @param orderId      订单ID
     * @param beforeStatus 原状态
     * @return 操作结果
     */
    public abstract Result<T> end(String orderId, Enum<PayStatus> beforeStatus);

    /**
     * 订单退款
     *
     * @param orderId      订单ID
     * @param beforeStatus 原状态
     * @return 操作结果
     */
    public abstract Result<T> refund(String orderId, Enum<PayStatus> beforeStatus);


}

package com.tang.service;

import com.tang.enums.PayChannel;
import com.tang.enums.PayStatus;
import com.tang.pojo.OrderInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 订单类
 *
 * @author Tang
 * @since 2021-07-18
 */
public class OrderService {

    private static final Map<String, Enum<PayStatus>> statusMap = new ConcurrentHashMap<>();

    /**
     * 初始化订单
     *
     * @param orderId    订单ID
     * @param statusEnum 订单状态
     */
    public static void init(String orderId, Enum<PayStatus> statusEnum) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setOrderName("测试商品");
        orderInfo.setStatus(statusEnum);
        orderInfo.setSeller("acitcn");
        orderInfo.setBuyer("carowner");
        orderInfo.setMoney(new BigDecimal("32"));
        orderInfo.setPayChannel(PayChannel.ALIPAY);
        orderInfo.setBeginTime(LocalDateTime.parse("2021-07-12T11:58:58"));
        orderInfo.setEndTime(LocalDateTime.now());
        statusMap.put(orderId, statusEnum);
    }

    /**
     * 根据ID查询订单信息
     *
     * @param orderId 订单ID
     * @return 订单信息
     */
    public static OrderInfo queryOrderInfo(String orderId) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setOrderName("测试商品");
        orderInfo.setStatus(statusMap.get(orderId));
        orderInfo.setSeller("acitcn");
        orderInfo.setBuyer("carowner");
        orderInfo.setMoney(new BigDecimal("32"));
        orderInfo.setPayChannel(PayChannel.ALIPAY);
        orderInfo.setBeginTime(LocalDateTime.parse("2021-07-12T11:58:58"));
        orderInfo.setEndTime(LocalDateTime.now());
        return orderInfo;
    }

    /**
     * 查询订单状态
     *
     * @param orderId 订单ID
     * @return 查询结果
     */
    public static Enum<PayStatus> queryOrderStatus(String orderId) {
        return statusMap.get(orderId);
    }

    /**
     * 订单状态变更
     *
     * @param orderId      订单ID
     * @param beforeStatus 变更状态前
     * @param afterStatus  变更状态后
     */
    public static synchronized void execStatus(String orderId, Enum<PayStatus> beforeStatus, Enum<PayStatus> afterStatus) {
        if (!beforeStatus.equals(statusMap.get(orderId))) return;
        statusMap.put(orderId, afterStatus);
    }

}

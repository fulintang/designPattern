package com.tang.pojo;

import com.tang.enums.PayChannel;
import com.tang.enums.PayStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单信息
 */
@Data
public class OrderInfo {

    private String orderId;
    private String orderName;
    private Enum<PayStatus> status;
    private BigDecimal money;
    private String buyer;
    private String seller;
    private Enum<PayChannel> payChannel;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;

}

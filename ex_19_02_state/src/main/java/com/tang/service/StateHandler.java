package com.tang.service;

import com.tang.enums.PayStatus;
import com.tang.service.impl.*;
import com.tang.vo.Result;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class StateHandler {

    private final Map<Enum<PayStatus>, State<Object>> stateMap = new ConcurrentHashMap<>();

    public StateHandler() {
        stateMap.put(PayStatus.NOT_PAID, new NotPayState<>());
        stateMap.put(PayStatus.CLOSED, new CloseState<>());
        stateMap.put(PayStatus.HAVE_PAID, new PayState<>());
        stateMap.put(PayStatus.END, new EndState<>());
        stateMap.put(PayStatus.REFUND, new RefundState<>());
    }

    public Result<Object> pay(String orderId, Enum<PayStatus> beforeStatus) {
        return stateMap.get(beforeStatus).pay(orderId, beforeStatus);
    }

    public Result<Object> close(String orderId, Enum<PayStatus> beforeStatus) {
        return stateMap.get(beforeStatus).close(orderId, beforeStatus);
    }

    public Result<Object> end(String orderId, Enum<PayStatus> beforeStatus) {
        return stateMap.get(beforeStatus).end(orderId, beforeStatus);
    }

    public Result<Object> refund(String orderId, Enum<PayStatus> beforeStatus) {
        return stateMap.get(beforeStatus).refund(orderId, beforeStatus);
    }

}

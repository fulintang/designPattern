package com.tang.card;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        log.info("模拟发放爱奇艺会员卡一张：{}, {}", bindMobileNumber, cardId);
    }

}

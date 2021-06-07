package com.tang.model.impl;

import com.tang.model.IPayModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayCypher implements IPayModel {

    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验环境安全");
        return true;
    }

}

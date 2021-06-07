package com.tang.model.impl;

import com.tang.model.IPayModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayFingerpaintMode implements IPayModel {

    @Override
    public boolean security(String uId) {
        log.info("指纹支付，风控校验指纹信息");
        return true;
    }

}

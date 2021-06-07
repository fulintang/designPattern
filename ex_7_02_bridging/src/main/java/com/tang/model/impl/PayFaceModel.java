package com.tang.model.impl;

import com.tang.model.IPayModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayFaceModel implements IPayModel {

    @Override
    public boolean security(String uId) {
        log.info("人脸支付，风控校验脸部识别");
        return true;
    }

}

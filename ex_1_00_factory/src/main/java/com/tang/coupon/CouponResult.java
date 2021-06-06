package com.tang.coupon;

import lombok.Data;

@Data
public class CouponResult {

    private String code;
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }
}

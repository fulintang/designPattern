package com.tang.coupon;

import lombok.extern.slf4j.Slf4j;

/**
 * 模拟优惠券服务
 */
@Slf4j
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        log.info("模拟发放优惠券一张：{}, {}, {}", uId, couponNumber, uuid);
        return new CouponResult("0000", "发放成功");
    }

}

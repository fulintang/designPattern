package com.tang.discount.event;

import com.tang.discount.ICouponDiscount;

import java.math.BigDecimal;

public class ZKCouponDiscount implements ICouponDiscount<BigDecimal> {

    @Override
    public BigDecimal discountAmount(BigDecimal couponInfo, BigDecimal skuPrice) {
        return null;
    }

}

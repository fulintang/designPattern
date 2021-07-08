package com.tang.discount.event;

import com.tang.discount.ICouponDiscount;

import java.math.BigDecimal;

/**
 * N元购
 */
public class ZJCouponDiscount implements ICouponDiscount<BigDecimal> {

    @Override
    public BigDecimal discountAmount(BigDecimal couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(couponInfo);
        return discountAmount.compareTo(BigDecimal.ZERO) < 1 ? BigDecimal.ONE : discountAmount;
    }

}

package com.tang.discount.event;

import com.tang.discount.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("o");

        if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;

        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        return discountAmount.compareTo(BigDecimal.ZERO) < 1 ? BigDecimal.ONE : discountAmount;
    }

}

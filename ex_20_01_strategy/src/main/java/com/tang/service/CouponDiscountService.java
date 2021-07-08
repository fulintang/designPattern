package com.tang.service;

import java.math.BigDecimal;

public class CouponDiscountService {

    /**
     * 计算优惠
     *
     * @param type 优惠类型
     * @param typeCount 优惠
     * @param skuPrice 原价
     * @param typeExt 限定价格值
     * @return 优惠后的价格
     */
    public BigDecimal disCountAmount(int type, BigDecimal typeCount, BigDecimal skuPrice, BigDecimal typeExt) {

        // 1.直减券
        if (1 == type) {
            return skuPrice.subtract(typeCount);
        }
        // 2.满减券
        if (2 == type) {
            if (skuPrice.compareTo(typeExt) < 0) {
                return skuPrice;
            }
            return skuPrice.subtract(typeCount);
        }
        // 3.折扣券
        if (3 == type) {
            return skuPrice.multiply(typeCount);
        }
        // 4.n元购
        if (4 == type) {
            return typeCount;
        }
        return skuPrice;
    }

}

package com.tang.discount;

import java.math.BigDecimal;

/**
 * 折扣Service
 */
public interface ICouponDiscount<T> {

    /**
     * @param couponInfo 折扣券信息；直减，满减，折扣，N元购
     * @param skuPrice   sku金额
     * @return 优惠后的金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}

package com.tang.discount;

import com.tang.discount.event.ZJCouponDiscount;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

@Slf4j
public class ApiTest {

    @Test
    public void test_zj() {
        Context<BigDecimal> doubleContext = new Context<>(new ZJCouponDiscount());
        BigDecimal bigDecimal = doubleContext.discountAmount(new BigDecimal(10), new BigDecimal(100));
        log.info("测试结果：直减后的金额{}", bigDecimal);
    }

}

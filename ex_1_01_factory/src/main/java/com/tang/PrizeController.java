package com.tang;

import com.alibaba.fastjson.JSON;
import com.tang.coupon.CouponResult;
import com.tang.coupon.CouponService;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class PrizeController {
    
    private static final String SUCCESS = "0000";
    private static final String SUCCESS_INFO = "发放成功";
    
    private static final String FAIL = "1111";
    private static final String FAIL_INFO = "发放失败";
    
    private AwardRes awardToUser(AwardReq req) {

        AwardRes res = null;
        
        try {
            log.info("奖品发放开始{}。req:{}", req.getUId(), req);
            // 按照不同类型发放， 1优惠券、2实物商品、3第三方兑换卡（爱奇艺）
            if (Objects.equals(req.getAwardType(), 1)) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getUId(), req.getAwardNumber(), req.getBizId());
                if (Objects.equals(SUCCESS, couponResult.getCode())) {
                    res = new AwardRes(SUCCESS, SUCCESS_INFO);
                }
            
            } else if (Objects.equals(req.getAwardType(), 2)) {
                
            } else if (Objects.equals(req.getAwardType(), 3)) {
                
            }
            
        } catch (Exception e) {
            
        }

        return res;
    }
    
}

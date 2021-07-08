package com.tang.service.impl;

import com.tang.entity.CarInfo;
import com.tang.service.IBillingService;

import java.util.Calendar;
import java.util.Date;

public class BillingServiceImpl implements IBillingService {

    private static final Boolean IF_EXTENDED_FOR_OVERDUE_CAR = true;
    private static final Integer OVERDUE_DAY = 3;

    @Override
    public String process(CarInfo carInfo) {
        if (carInfo.getLicense() != null) {
            // 有牌车辆
            if (!carInfo.getIsBlack()) {
                // 非黑名单车辆
                if (!carInfo.getIsSpecial()) {
                    // 常规车辆
                    if (carInfo.getIsMonthly()) {
                        // 固定车处理模式
                        if (carInfo.getEndTime().before(new Date())) {
                            // 已过期
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(Calendar.DATE, OVERDUE_DAY);
                            Date time = calendar.getTime();
                            if (IF_EXTENDED_FOR_OVERDUE_CAR && carInfo.getEndTime().after(time)) {
                                // 可延期车辆
                                return "固定车延期模式,不收费";
                            } else {
                                return "临时车模式收费";
                            }

                        } else {
                            // 未过期
                            return "不收费";
                        }

                    } else {
                        // 非固定车车处理模式
                        if ("green".equals(carInfo.getLicenseCollor())) {
                            return "绿牌收费模式";
                        }
                        if ("yellow".equals(carInfo.getLicenseCollor())) {
                            return "黄牌车收费模式";
                        }
                    }

                } else {
                    // 特殊车辆
                    return "特殊车辆不收费";
                }

            } else {
                // 黑名单车辆
                return "黑名单车处理";
            }

        } else {
            // 无牌车辆
            return "无牌车辆处理";
        }
        return null;
    }

}

package com.tang.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CarInfo {

    private String id;

    // 车牌
    private String license;

    // 是否是包月车
    private Boolean isMonthly;

    // 车牌颜色
    private String licenseCollor;

    // 车辆大小
    private Integer size;

    // 是否黑名单
    private Boolean isBlack;

    // 是否特殊特车辆
    private Boolean isSpecial;

    private Date startTime;

    private Date endTime;

}

package com.tang.impl;

import com.tang.IMenu;
import com.tang.Matter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageMenu implements IMenu {
    
    private List<Matter> list = new ArrayList<>(); // 装修清单
    
    private BigDecimal price = BigDecimal.ZERO; // 装修价格
    
    private BigDecimal area; // 面积
    
    private String grade; // 装修等级；豪华欧式、轻奢田园、现代简约

    public DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCelling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder builder = new StringBuilder("\r\n----------------------------------\r\n");
        builder.append("装修清单").append("\r\n");
        builder.append("套餐等级:").append(grade).append("\r\n");
        builder.append("套餐价格:").append(price.setScale(2, RoundingMode.HALF_UP)).append("\r\n");
        builder.append("房屋面积:").append(area.doubleValue()).append("平米").append("\r\n");

        for (Matter matter : list) {
            builder.append(matter.scene())
                    .append(":")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.model())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append(" 元。\n");
        }
        return builder.toString();
    }
}

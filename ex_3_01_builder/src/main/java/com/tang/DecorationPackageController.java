package com.tang;

import com.tang.celling.LevelOneCelling;
import com.tang.celling.LevelTwoCelling;
import com.tang.coat.DuluxCoat;
import com.tang.coat.LiBangCoat;
import com.tang.floor.ShengXiangFloor;
import com.tang.tile.DongPengTile;
import com.tang.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController {

    public String getMatterList(BigDecimal area, Integer level) {

        List<Matter> list = new ArrayList<>(); // 装修清单
        BigDecimal price = BigDecimal.ZERO; // 装修价格

        // 豪华欧式
        if (1 == level) {
            LevelTwoCelling levelTwoCelling = new LevelTwoCelling(); // 吊顶，二级顶
            DuluxCoat duluxCoat = new DuluxCoat(); // 涂料，多乐士
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor(); // 地板，圣象

            list.add(levelTwoCelling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCelling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));

        }

        // 轻奢田园
        if (2 == level) {
            LevelTwoCelling levelTwoCelling = new LevelTwoCelling();// 吊顶，二级顶
            LiBangCoat liBangCoat = new LiBangCoat(); // 涂料，立邦
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile(); // 地砖，马可波罗

            list.add(levelTwoCelling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCelling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        // 现代简约
        if (3 == level) {
            LevelOneCelling levelOneCelling = new LevelOneCelling(); // 吊顶，一级顶
            LiBangCoat liBangCoat = new LiBangCoat(); // 涂料，立邦
            DongPengTile dongPengTile = new DongPengTile(); // 地砖，东鹏

            list.add(levelOneCelling);
            list.add(liBangCoat);
            list.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCelling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));

        }

        StringBuilder builder = new StringBuilder("\r\n----------------------------------\r\n");
        builder.append("装修清单").append("\r\n");
        builder.append("套餐等级:").append(level).append("\r\n");
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

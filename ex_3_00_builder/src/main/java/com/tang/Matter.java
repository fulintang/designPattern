package com.tang;

import java.math.BigDecimal;

/**
 * 装修物料
 * 物料接口提供了基本的信息，以保证所有的装修材料都可以按照统一的标准进行获取
 */
public interface Matter {

    String scene(); // 场景：地板、地砖、涂料、吊顶

    String brand(); // 品牌

    String model(); // 型号

    BigDecimal price(); // 价格

    String desc(); // 描述

}

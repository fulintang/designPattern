package com.tang.service.logic.engine;


import com.tang.service.logic.LogicFilter;
import com.tang.service.logic.impl.UserAgeFilter;
import com.tang.service.logic.impl.UserGenderFilter;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 微信公众号：bugstack虫洞栈 | 专注原创技术专题案例
 * 论坛：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
@Data
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

}

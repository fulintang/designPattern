package com.tang.service.logic.engine;


import com.tang.model.aggregates.TreeRich;
import com.tang.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}

package com.tang.service.logic;

import com.tang.model.vo.TreeNode;
import com.tang.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {

    /**
     * 逻辑决策器
     * 
     * @param matterValue 决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);
    
    /**
     * 获取决策值
     * 
     * @param treeId 树id
     * @param userId 用户id
     * @param decisionMatter 决策无聊
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
    
}

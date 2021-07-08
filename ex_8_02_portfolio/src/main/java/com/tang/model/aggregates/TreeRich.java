package com.tang.model.aggregates;


import com.tang.model.vo.TreeNode;
import com.tang.model.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * 规则树聚合
 *
 * @author Tang
 */
@Data
public class TreeRich {

    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
}

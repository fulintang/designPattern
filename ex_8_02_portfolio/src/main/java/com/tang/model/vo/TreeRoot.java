package com.tang.model.vo;

import lombok.Data;

/**
 * 规则树树根
 */
@Data
public class TreeRoot {
    
    private Long treeId; // 规则树ID
    private Long treeRootNodeId; // 规则树根ID
    private String treeName; // 规则树名称
    
}

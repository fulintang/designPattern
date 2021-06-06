package com.tang;

import lombok.extern.slf4j.Slf4j;

/**
 * 单例最佳实现
 * 线程安全，自由串行化，单一实例
 * 该种方法在继承场景下是不可用的
 */
@Slf4j
public enum Singleton_07 {
    
    INSTANCE;
    
    public void test() {
        log.info("Hi-");
    }
    
}

package com.tang;

/**
 * 双重锁校验
 * 双重锁是方法级锁的优化，减少了部分获取实例的耗时
 * 懒加载
 */
public class Singleton_05 {
    
    private static Singleton_05 instance;
    
    private Singleton_05() {}
    
    public static Singleton_05 getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
    
}

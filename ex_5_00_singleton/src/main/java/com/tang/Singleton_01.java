package com.tang;

/**
 * 懒汉模式（线程不安全）
 * 单例模式的一大特点就是不允许外部直接创建，也就是new Singletion_01()，所以构造方法为private
 * 该种单例满足懒加载，但是在并发环境下存在问题，可能出现new了多个Singletion_01的情况。
 * 
 * @author fulin.tang
 */
public class Singleton_01 {
    
    private static Singleton_01 instance;

    private Singleton_01() {
    }
    
    public static Singleton_01 getInstance() {
        if (null == instance) {
            instance = new Singleton_01();
        }
        return instance;
    }
    
}

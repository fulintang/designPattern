package com.tang;

/**
 * 懒汉模式（线程安全）
 * 枷锁，但是多线程锁占用会造成资源浪费
 */
public class Singleton_02 {

    public static Singleton_02 instance;

    private Singleton_02() {
    }
    
    public static synchronized Singleton_02 getInstance() {
        if (null == instance) {
            instance = new Singleton_02();
        }
        return instance;
    }

}

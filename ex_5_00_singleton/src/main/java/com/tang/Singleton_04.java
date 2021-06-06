package com.tang;

/**
 * 使用类的内部类（线程安全）
 * 静态内部类，懒加载，线程安全，且不存在锁资源浪费
 * 一个类的构造方法，在多线程环境可被正确加载？？？
 */
public class Singleton_04 {
    
    private static class SingletonHolder {
        private static final Singleton_04 instance = new Singleton_04();
    }
    
    private Singleton_04(){}    
    
    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
    
}

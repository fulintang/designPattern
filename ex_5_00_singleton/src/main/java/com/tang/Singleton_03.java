package com.tang;

/**
 * 饿汉模式（线程安全）
 * 但是不管是否使用都会占用内存
 */
public class Singleton_03 {
    
    private static Singleton_03 instance = new Singleton_03();
    
    private Singleton_03() {
    }
    
    public static Singleton_03 getInstance() {
        return instance;
    }
    
}

package com.tang;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 1 Java并发库提供了很多原子类来支持并发访问的数据安全性，AtomicInteger, AtomicBoolean, AtomicLong, AtomicReference
 * 2 AtomicReference可以封装引用一个V实例，支持并发访问如下的单例实例。
 * 3 使用CAS的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于CAS的忙等算法，依赖于底层硬件实现，来保证线程安全。
 * 相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以支持较大的并发性。
 * 4 CAS缺陷，忙等，如果一直没有获取到将会处于死循环中。
 */
public class Singleton_06 {
    
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private Singleton_06() {}
    
    public static Singleton_06 getInstance() {
        for (;;) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
    
}

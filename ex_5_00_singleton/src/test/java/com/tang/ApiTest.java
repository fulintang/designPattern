package com.tang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {
    
    @Test
    public void test01() {
        log.info("{}", Singleton_01.getInstance());
        log.info("{}", Singleton_01.getInstance());
    }
    
    @Test
    public void test02() {
        log.info("{}", Singleton_02.getInstance());
        log.info("{}", Singleton_02.getInstance());
    }

    @Test
    public void test03() {
        log.info("{}", Singleton_03.getInstance());
        log.info("{}", Singleton_03.getInstance());
    }

    @Test
    public void test04() {
        log.info("{}", Singleton_04.getInstance());
        log.info("{}", Singleton_04.getInstance());
    }

    @Test
    public void test05() {
        log.info("{}", Singleton_05.getInstance());
        log.info("{}", Singleton_05.getInstance());
    }

    @Test
    public void test06() {
        log.info("{}", Singleton_06.getInstance());
        log.info("{}", Singleton_06.getInstance());
    }

    @Test
    public void test07() {
        log.info("{}", Singleton_07.INSTANCE);
        log.info("{}", Singleton_07.INSTANCE);
        Singleton_07.INSTANCE.test();
        Singleton_07.INSTANCE.test();
    }
    
}

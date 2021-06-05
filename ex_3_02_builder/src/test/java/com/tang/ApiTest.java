package com.tang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {
    
    @Test
    public void testBuilder() {
        String levelOne = Builder.builder().levelOne(132.5D).getDetail();
        log.info(levelOne);

        String levelTwo = Builder.builder().levelTwo(98.25D).getDetail();
        log.info(levelTwo);

        String levelThree = Builder.builder().levelThree(85.43D).getDetail();
        log.info(levelThree);

    }
    
}

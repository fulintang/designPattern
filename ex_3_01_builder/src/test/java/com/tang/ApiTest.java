package com.tang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

@Slf4j
public class ApiTest {

    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decoration = new DecorationPackageController();

        log.info(decoration.getMatterList(new BigDecimal("135.2"), 1));

        log.info(decoration.getMatterList(new BigDecimal("98.25"), 2));

        log.info(decoration.getMatterList(new BigDecimal("85.43"), 3));

    }

}

package com.tang.service;

import com.tang.entity.CarInfo;
import com.tang.service.impl.BillingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {
    
    @Test
    public void testBilling() {

        CarInfo carInfo = new CarInfo();
        
        carInfo.setId("0000001");
        carInfo.setIsBlack(false);
        carInfo.setIsSpecial(false);
        carInfo.setIsMonthly(false);
        carInfo.setLicense("川B590PZ");
        carInfo.setLicenseCollor("blue");
        carInfo.setSize(1);
        
        IBillingService billingService = new BillingServiceImpl();

        String process = billingService.process(carInfo);
        log.info("策略：{}", process);


    }
    
}

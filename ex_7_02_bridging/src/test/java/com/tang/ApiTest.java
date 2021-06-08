package com.tang;

import com.tang.channel.Pay;
import com.tang.channel.impl.WxPay;
import com.tang.channel.impl.ZfbPay;
import com.tang.model.impl.PayFaceModel;
import com.tang.model.impl.PayFingerpaintMode;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test() {
        Pay wxPay = new WxPay(new PayFaceModel());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        Pay zfbPay = new ZfbPay(new PayFingerpaintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));
    }

}

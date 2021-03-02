package com.ysl;

import com.ysl.com.ysl.Phone;
import com.ysl.com.ysl.PhoneFactory;
import com.ysl.com.ysl.factory.ApplePhoneFactory;
import com.ysl.com.ysl.factory.HuaweiPhoneFactory;

/**
 * 工厂模式
 */
public class App 
{
    public static void main(String[] args) {
        PhoneFactory applePhoneFactory = new ApplePhoneFactory();
        Phone iphone = applePhoneFactory.createPhone();
        iphone.printBrand();

        PhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        Phone huaweiPhone = huaweiPhoneFactory.createPhone();
        huaweiPhone.printBrand();
    }
}

package com.ysl.com.ysl.factory;

import com.ysl.com.ysl.Phone;
import com.ysl.com.ysl.PhoneFactory;
import com.ysl.com.ysl.brand.Iphone;

public class ApplePhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}

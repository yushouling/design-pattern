package com.ysl.com.ysl.factory;

import com.ysl.com.ysl.Phone;
import com.ysl.com.ysl.PhoneFactory;
import com.ysl.com.ysl.brand.HuaweiPhone;

public class HuaweiPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}

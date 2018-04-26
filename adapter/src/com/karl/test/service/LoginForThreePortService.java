package com.karl.test.service;

import com.karl.test.entity.ResultMsg;
import com.karl.test.passport.LoginForEmailAdapter;
import com.karl.test.passport.LoginForPhoneNumberAdapter;
import com.karl.test.passport.LoginForQQAdapter;

public class LoginForThreePortService extends UserService {

    public ResultMsg loginForQQ(String QQNumber, String password){
        new LoginForQQAdapter().login(QQNumber, password);
        return super.login(QQNumber, null);
    }

    public ResultMsg loginForEmail(String email, String password){
        new LoginForEmailAdapter().login(email, password);
        return super.login(email, null);
    }

    public ResultMsg loginForPhone(String phoneNumber, String validateCode){
        new LoginForPhoneNumberAdapter().login(phoneNumber, validateCode);
        return super.login(phoneNumber, null);
    }

}

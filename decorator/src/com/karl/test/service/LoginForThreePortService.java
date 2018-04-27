package com.karl.test.service;

import com.karl.test.entity.ResultMsg;
import com.karl.test.passport.LoginForEmailAdapter;
import com.karl.test.passport.LoginForPhoneNumberAdapter;
import com.karl.test.passport.LoginForQQAdapter;

public class LoginForThreePortService extends UserService {

    private UserService userService;

    public LoginForThreePortService(UserService userService) {
        this.userService = userService;
    }

    public ResultMsg loginForQQ(String QQNumber, String password){
        new LoginForQQAdapter().login(QQNumber, password);
        return userService.login(QQNumber, null);
    }

    public ResultMsg loginForEmail(String email, String password){
        new LoginForEmailAdapter().login(email, password);
        return userService.login(email, null);
    }

    public ResultMsg loginForPhone(String phoneNumber, String validateCode){
        new LoginForPhoneNumberAdapter().login(phoneNumber, validateCode);
        return userService.login(phoneNumber, null);
    }

}

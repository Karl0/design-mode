package com.karl.test.service;

import com.karl.test.entity.ResultMsg;
import com.karl.test.passport.LoginForUsernameAdapter;

public class LoginForUsernameService extends UserService {

    public ResultMsg loginForUsername(String username, String password){
        new LoginForUsernameAdapter().login(username, password);
        return  super.login(username, null);
    }

}

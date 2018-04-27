package com.karl.test.service;

import com.karl.test.entity.ResultMsg;
import com.karl.test.passport.LoginForUsernameAdapter;

public class LoginForUsernameService extends UserService {

    private UserService userService;

    public LoginForUsernameService(UserService userService) {
        this.userService = userService;
    }

    public ResultMsg loginForUsername(String username, String password){
        new LoginForUsernameAdapter().login(username, password);
        return  userService.login(username, null);
    }

}

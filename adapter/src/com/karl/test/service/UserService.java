package com.karl.test.service;

import com.karl.test.entity.ResultMsg;
import com.karl.test.entity.User;

public class UserService {

    protected ResultMsg login(String username, String password){
        User user = new User();
        user.setUsername(username);
        return new ResultMsg(200, "登陆成功！", user);
    }

}

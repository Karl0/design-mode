package com.karl.test.main;

import com.karl.test.entity.ResultMsg;
import com.karl.test.service.LoginForThreePortService;
import com.karl.test.service.LoginForUsernameService;
import com.karl.test.service.UserService;

public class DecoratorTest {

    public static void main(String[] args) {
        //被装饰类
        UserService userService = new UserService();

        //装饰类
        LoginForUsernameService loginForUsernameService = new LoginForUsernameService(userService);
        ResultMsg msg = loginForUsernameService.loginForUsername("Karl", "123456");
        System.out.println(msg);

        //装饰类
        LoginForThreePortService loginForThreePortService = new LoginForThreePortService(userService);
        msg = loginForThreePortService.loginForQQ("10001", "123456");
        System.out.println(msg);

        msg = loginForThreePortService.loginForEmail("10001@qq.com", "123456");
        System.out.println(msg);

        msg = loginForThreePortService.loginForPhone("13910000000", "12xy56");
        System.out.println(msg);

    }

}

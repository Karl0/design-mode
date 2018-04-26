package com.karl.test.main;

import com.karl.test.entity.ResultMsg;
import com.karl.test.service.LoginForUsernameService;
import com.karl.test.service.LoginForThreePortService;

public class AdapterTest {

    public static void main(String[] args) {
        LoginForThreePortService loginForThreePortService = new LoginForThreePortService();
        ResultMsg resultMsg = loginForThreePortService.loginForQQ("10001", "123456");
        System.out.println(resultMsg);
        resultMsg = loginForThreePortService.loginForEmail("10001@qq.com", "123456");
        System.out.println(resultMsg);
        resultMsg = loginForThreePortService.loginForPhone("13910000000", "12xy56");
        System.out.println(resultMsg);
        LoginForUsernameService loginForUsernameService = new LoginForUsernameService();
        resultMsg = loginForUsernameService.loginForUsername("Karl", "123456");
        System.out.println(resultMsg);
    }

}

package com.ck.usercenter.service;
import java.util.Date;


import com.ck.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("user1");
        user.setUserAccount("123");
        user.setAvatarUrl("https://profile.csdnimg.cn/C/E/D/1_weixin_47595471");
        user.setGender((byte) 0);
        user.setUserPassword("123");
        user.setPhone("111");
        user.setEmail("222");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }




    @Test

    void userRegister() {
        String userAccount = "yupi11";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "4455";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(1, result);
    }
}
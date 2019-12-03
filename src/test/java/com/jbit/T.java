package com.jbit;

import com.jbit.entity.User;
import com.jbit.mapper.UserMapper;
import com.jbit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class T {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;


    /*@Test
    public void test(){
        System.out.println(userMapper.findById(1));
    }*/

    @Test
    public void test1(){
        User user = userMapper.findById(1);
        user.setPassword("11111");
        User user2 = userMapper.findById(2);
        user2.setPassword("2222");
        userService.updateUser(user,user2);
    }
}

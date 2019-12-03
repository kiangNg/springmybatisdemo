package com.jbit.service;

import com.jbit.entity.User;
import com.jbit.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService {
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int updateUser(User ... users){
        for(User user: users){
            userMapper.update(user);
            System.out.println(4/0);
        }
        return 1;
    }
}

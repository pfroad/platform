package com.qmall.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.qmall.platform.mapper.UserMapper;
import com.qmall.platform.model.User;
import com.qmall.platform.service.UserService;

/**
 * Created by caoyi on 5/13/15.
 */
@Component("userService")
@Service(version="1.0.0", timeout=25000)
public class UserServiceImpl implements UserService {
	@Autowired
    private UserMapper userMapper;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public String sayHello(String msg) {
        return "Hello " + msg;
    }

    public User getUser(Integer id) {
        return userMapper.get(id);
    }

}

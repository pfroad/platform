package com.qmall.platform.service;

import com.qmall.platform.model.User;

/**
 * Created by caoyi on 5/13/15.
 */
public interface UserService {
    String sayHello(String msg);
    User getUser(Integer id);
}

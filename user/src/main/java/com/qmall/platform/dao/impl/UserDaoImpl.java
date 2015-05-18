package com.qmall.platform.dao.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.qmall.platform.dao.UserDao;
import com.qmall.platform.dao.base.BaseDaoImpl;
import com.qmall.platform.model.User;

/**
 * Created by caoyi on 5/13/15.
 
@Repository("userDao")*/
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {
	
	@PostConstruct
	public void init() {
		super.setSqlNamesSpace("com.qmall.platform.mybatis.UserMapper");
	}
//    public User get(Long id) {
//        User user = new User();
//        user.setId(1);
//        user.setName("1stUser");
//        user.setMobile("13333333333");
//        user.setPassword("111111");
//        return user;
//    }
}

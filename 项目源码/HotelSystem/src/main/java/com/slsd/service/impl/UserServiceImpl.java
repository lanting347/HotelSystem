package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.UserDao;
import com.slsd.entity.User;
import com.slsd.service.UserService;
@Service("userService")//通常作用在业务层
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	public List<User> getAllUser() {
		List<User> ulist=userDao.getAllUser();
		return ulist;
	}

	public boolean addUser(User user) {
		return userDao.addUser(user)>0?true:false;
	}

	public boolean editUser(User user) {
		return userDao.editUser(user)>0?true:false;
	}

	public boolean delUser(int uid) {
		return userDao.delUser(uid)>0?true:false;
	}

}

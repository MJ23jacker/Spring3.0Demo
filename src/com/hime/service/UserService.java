package com.hime.service;

import com.hime.dao.UserDao;
import com.hime.model.User;

public class UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(User u){
		userDao.save(u);
	}
	
	
}

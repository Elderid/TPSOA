package com.epsi.user.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.user.bo.UserBo;
import com.epsi.user.dao.UserDao;
import com.epsi.user.entity.User;

@Service("UserBo")
public class UserBoImpl implements UserBo{

	@Autowired
	UserDao userDao;
	
	
	public void setUSerDao(UserDao userDao){
		this.userDao = userDao;
	}

	public void create(User user) {
		userDao.create(user);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}

	public User findByUserLogin(String userLogin) {
		return userDao.findByUserLogin(userLogin);
	}
	

	


}

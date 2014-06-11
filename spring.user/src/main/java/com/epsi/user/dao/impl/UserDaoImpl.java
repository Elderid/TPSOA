package com.epsi.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.epsi.user.dao.UserDao;
import com.epsi.user.entity.User;
import com.epsi.util.CustomHibernateDaoSupport;


public class UserDaoImpl extends CustomHibernateDaoSupport implements UserDao{

	public void create(User user) {
		getHibernateTemplate().create(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findByUserLogin(String userLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

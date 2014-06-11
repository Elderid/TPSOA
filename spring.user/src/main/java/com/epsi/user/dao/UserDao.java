package com.epsi.user.dao;

import com.epsi.user.entity.User;

public interface UserDao {

	void create(User user);
	void update (User user);
	void delete (User user);
	User findByUserLogin(String userLogin);
}

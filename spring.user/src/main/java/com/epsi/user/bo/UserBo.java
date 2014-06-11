package com.epsi.user.bo;

import com.epsi.user.entity.User;

public interface UserBo {
	
	void create(User user);
	void update (User user);
	void delete (User user);
	User findByUserLogin(String userLogin);

}

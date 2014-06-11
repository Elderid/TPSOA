package com.epsi.user.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.epsi.user.dao.AbstractDao;
import com.epsi.user.dao.UserDao;
import com.epsi.user.entity.UserEntity;



@Repository("UserDao")
public class UserDaoImpl extends AbstractDao<UserEntity, Long> implements UserDao {

	private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	public UserDaoImpl() {
		super();
	}



	public Long create(UserEntity obj) {
		// TODO Auto-generated method stub
		return null;
	}


	public UserEntity find(Long id) {
		return this.find(UserEntity.class, id);
	}



	
}

package com.epsi.user.dao;

import java.util.List;

import com.epsi.user.entity.UserEntity;

public interface UserDao {

	/**
	 * List every objects of the selected type from the data source
	 *
	 * @return
	 */
	public List<UserEntity> list(Class<UserEntity> c);


	/**
	 * Find an object identified by an ID
	 *
	 * @param id
	 * @return
	 */
	public UserEntity find(Long id);


	/**
	 * Save an object in the data source
	 *
	 * @param obj
	 */
	public Long create(UserEntity obj);

	/**
	 * Update an object present in the data source
	 * 
	 * @retrun
	 */
	public void update(UserEntity obj);

	/**
	 * Delete an object from the data source
	 *
	 * @param obj
	 */
	public void delete(UserEntity obj);
}

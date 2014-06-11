package com.epsi.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 



import com.epsi.user.bo.UserBo;
import com.epsi.user.dao.UserDao;
import com.epsi.user.entity.UserEntity;
import com.epsi.user.bo.UserBo;
import com.epsi.user.entity.UserEntity;
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
 
    	UserDao userDao = (UserDao)appContext.getBean("userBo");
 
    	/** insert **/
    	UserEntity user = new UserEntity();
    	user.setUserLogin("toto");
    	user.setUserPassword("toto");
    	userDao.create(user);
 
    	/** select **/
    	UserEntity user2 = userDao.findByUserLogin("toto");
    	System.out.println(user2);
 
    	/** update **/
    	user2.setUserPassword("titi");
    	userDao.update(user2);
 
    	/** delete **/
    	userDao.delete(user2);
 
    	System.out.println("Done");
    }
}
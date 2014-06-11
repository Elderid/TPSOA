package com.epsi.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 


import com.epsi.user.bo.UserBo;
import com.epsi.user.entity.User;
import com.epsi.user.bo.UserBo;
import com.epsi.user.entity.User;
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
 
    	UserBo userBo = (UserBo)appContext.getBean("userBo");
 
    	/** insert **/
    	User user = new User();
    	user.setUserLogin("toto");
    	user.setUserPassword("toto");
    	userBo.create(user);
 
    	/** select **/
    	User user2 = userBo.findByUserLogin("toto");
    	System.out.println(user2);
 
    	/** update **/
    	user2.setUserPassword("titi");
    	userBo.update(user2);
 
    	/** delete **/
    	userBo.delete(user2);
 
    	System.out.println("Done");
    }
}
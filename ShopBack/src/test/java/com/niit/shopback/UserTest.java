package com.niit.shopback;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopback.DAO.UserDAO;
import com.niit.shopback.model.User;

public class UserTest {
		public static void main(String[] args) 
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.shopback");
			context.refresh();
			UserDAO userDAO =(UserDAO)context.getBean("userDAO");
			User user = (User)context.getBean("user");
			user.setId("Pro1");
			user.setName("Doll");
			user.setAddress("Hyderabad");
			user.setMobile("8123456723");
			user.setMail("emmounusha14@gmail.com");
			user.setPassword("manu14");
			userDAO.saveOrUpdate(user);
			
			 userDAO.delete("user");
		     userDAO.get("user");
			List<User>list = userDAO.list();
			for(User cat: list)
			{
				System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getAddress() +":"+ cat.getMobile() +":"+ cat.getMail() +":"+ cat.getPassword());
			}
			context.close();
			
		}
	}


package com.niit.backendproject;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendproject.dao.UserDAO;
import com.niit.backendproject.domain.User;

public class UserDAOTestCase {

	@Autowired static AnnotationConfigApplicationContext context;		//ACAC is used to configure Db using Annotations
	
	@Autowired static UserDAO userDAO;
	
	@Autowired static User user;
	
	//initialize the abiove methods
	
	@BeforeClass
	
	public static void initialize(){
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get userdao from context
		userDAO=(UserDAO) context.getBean("userDAO");
		
		//get user from context
		user=(User) context.getBean("user");
		}
	
	//TestCAses
	
	@Test
	public void createUserTestCase(){
		user.setId("1000");
		user.setName("SJJAIN");
		user.setPassword("sjjain");
		user.setRole("user");
		boolean flag=userDAO.save(user);
		assertEquals("createUserTestCase",true,flag);
		
	}
}
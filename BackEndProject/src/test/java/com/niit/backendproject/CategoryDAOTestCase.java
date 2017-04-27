package com.niit.backendproject;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendproject.dao.CategoryDAO;

import com.niit.backendproject.domain.Category;


public class CategoryDAOTestCase {

	@Autowired static AnnotationConfigApplicationContext context;		//ACAC is used to configure Db using Annotations
	
	@Autowired static CategoryDAO categoryDAO;
	
	@Autowired static Category category; //table name
	
	//initialize the above methods
	
	@BeforeClass
	
	public static void initialize(){
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get categorydao from context
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		
		//get category from context
		category=(Category) context.getBean("category");
		}
	
	//TestCAses
	
	@Test
	public void createCategoryTestCase(){
		category.setId("1000");
		category.setName("Mouse");
		category.setType("Electronics");
		
		boolean flag=categoryDAO.save(category);
		assertEquals("createCategoryTestCase",true,flag);
		
	}
}
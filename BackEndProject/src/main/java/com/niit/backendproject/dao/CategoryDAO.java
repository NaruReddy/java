package com.niit.backendproject.dao;

import java.util.List;

import com.niit.backendproject.domain.Category;
import com.niit.backendproject.domain.User;

public interface CategoryDAO {

	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(Category category);
	public List<Category> list();
	public Category getById(String id);    
	public Category getByName(String name);
}

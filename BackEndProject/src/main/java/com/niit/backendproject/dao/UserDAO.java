package com.niit.backendproject.dao;

import java.util.List;

import com.niit.backendproject.domain.User;

public interface UserDAO {

	public boolean save(User user);
	public boolean update(User user);
	public boolean validate(String id, String password);
	public List<User> list();
	public User get(String id);    //getting user details based  on constraints, it might be on name, role etc 
}

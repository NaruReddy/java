package com.niit.backendproject.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.backendproject.dao.UserDAO;
import com.niit.backendproject.domain.User;

@Repository("UserDAO")
@Transactional //connecting to database
public class UserDAOImpl implements UserDAO{
	@Autowired    //reuse of data source info like url, username, password etc in database
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory)
	{
	this.sessionFactory = sessionFactory;
	}
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			} catch (Exception e) {
			e.printStackTrace();
		return false;   //second time execution with the same id, any limitations
			}
		return true;
	}

	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			} catch (Exception e) {
			e.printStackTrace();
		return false;   //second time execution with the same id, any limitations
			}
		return true;
	}

	public boolean validate(String id, String password) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User where id = ? and password = ?");
		query.setString(0, id);
		query.setString(1, password);
		if(query.uniqueResult()==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User get(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
		
	}

}

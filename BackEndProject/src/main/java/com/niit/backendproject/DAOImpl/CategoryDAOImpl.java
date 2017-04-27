package com.niit.backendproject.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backendproject.dao.CategoryDAO;
import com.niit.backendproject.domain.Category;
import com.niit.backendproject.domain.User;



@Repository("CategoryDAO")
@Transactional //connecting to database
public class CategoryDAOImpl implements CategoryDAO {
@Autowired

private SessionFactory sessionFactory;

public CategoryDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory = sessionFactory;
}
	public boolean save(Category category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			} catch (Exception e) {
			e.printStackTrace();
		return false;   //second time execution with the same id, any limitations
			}
		return true;
	}

	public boolean delete(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			} catch (Exception e) {
			e.printStackTrace();
		return false;   //second time execution with the same id, any limitations
			}
		return true;
	}

	public List<Category> list() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	public Category getById(String id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
	}
	public Category getByName(String name) {
		
		return (Category) sessionFactory.getCurrentSession().get(Category.class, name);
	}
	

}

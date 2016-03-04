package com.abee.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abee.entities.User;

@Repository
public class UserDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addUser(User user){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		List<User> userList = criteria.list();
		System.out.println(userList.size());
	}
}

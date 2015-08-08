package com.exoSpringSample.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.exoSpringSample.model.Contact;

public class ContactDaoImpl
{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Contact> getContacts()
	{
		List<Contact> contacts = new ArrayList<Contact>();
		String queryString = "select * from contacts";
		Query query = getSessionFactory().openSession().createQuery(queryString);
		contacts = query.list();
		
		return contacts;
	}

}

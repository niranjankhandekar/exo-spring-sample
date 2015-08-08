package com.exoSpringSample.impl;

import java.util.ArrayList;
import java.util.List;

import com.exoSpringSample.dao.ContactDao;
import com.exoSpringSample.model.Contact;
import com.exoSpringSample.service.ContactService;

public class ContactServiceImpl implements ContactService {
	private static List<Contact> contacts = new ArrayList();
	private ContactDao contactDao;
	public List<Contact> getContacts() 
	{
		contacts = contactDao.getContacts();
		
		return contacts;
	}


}

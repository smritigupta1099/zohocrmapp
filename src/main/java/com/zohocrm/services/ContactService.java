package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entites.Contact;

public interface ContactService {

	
	public void saveContact(Contact contact);

	 List<Contact> getContact();

	public Contact getContactById(long id);
}

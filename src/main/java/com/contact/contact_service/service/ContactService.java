package com.contact.contact_service.service;

import java.util.List;

import com.contact.contact_service.entity.Contact;

public interface ContactService {
	Contact getContact(Long cid);

	List<Contact> getContacts(Long userId);
}

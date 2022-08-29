package com.contact.contact_service.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	List<Contact> list = Arrays.asList(
			new Contact(1L, "abc@xyz.com", "nilanjan", 1311L),
			new Contact(2L, "qwe@xyz.com", "rittick",  1311L),
			new Contact(3L, "ghj@xyz.com", "patrick", 1312L),
			new Contact(4L, "plj@xyz.com", "rose", 1312L),
			new Contact(5L, "tyu@xyz.com", "john", 1313L),
			new Contact(6L, "mht@xyz.com", "sam", 1311L)
			);

	@Override
	public Contact getContact(Long cid) {
		return list.stream().filter(contact -> contact.getcId().equals(cid)).findAny().orElse(null);
	}

	@Override
	public List<Contact> getContacts(Long userId) {
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}

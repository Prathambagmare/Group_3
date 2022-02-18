package com.java.contact_module.service;



import com.java.contact_module.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContactofUser(Long userId);
}

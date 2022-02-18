package com.java.contact_module.service;


import com.java.contact_module.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{


    List<Contact> list = List.of(new Contact(1111L,"Naman Chauhan",76343526L,1234L)
,new Contact(2222L,"Naman Chauhan",76343526L,1234L));


    @Override
    public List<Contact> getContactofUser(Long userId) {
            return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}

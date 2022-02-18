package com.java.user_module.controller;

import com.java.user_module.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.java.user_module.service.UserService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    // @PathVariable is used get id from server
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {
       User user = this.userService.getUser(userId);

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId,List.class);

        user.setContacts(contacts);

        return user;
    }
}

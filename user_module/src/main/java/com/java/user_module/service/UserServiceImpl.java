package com.java.user_module.service;

import com.java.user_module.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service is used to Autowired this class
@Service
public class UserServiceImpl implements UserService {

    List<User> list = List.of(new User(1234L, "Pratham Bagmare", "7620538355"),
            new User(123456L, "Pratik Pardhi", "9823647587L"),
            new User(12345L, "Rohit Pandhare", "8746453387L")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getuserId().equals(id)).findAny().orElse(null);
    }
}

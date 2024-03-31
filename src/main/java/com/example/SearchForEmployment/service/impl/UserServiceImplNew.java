package com.example.SearchForEmployment.service.impl;

import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.repository.UserRepository;
import com.example.SearchForEmployment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("secondService")
@Primary
public class UserServiceImplNew implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String addNewName(String name) {

        userRepository.save(new User());
        return name + " + " + name +" = double "+ name ;
    }

}

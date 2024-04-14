package com.example.SearchForEmployment.service.impl;

import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.repository.UserRepository;
import com.example.SearchForEmployment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service("firstService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void registerUser(User user) {

            userRepository.save(user);
            User byEmail = userRepository.findByEmail(user.getEmail());
            System.out.println(byEmail);


    }
}

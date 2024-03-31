package com.example.SearchForEmployment.service.impl;

import com.example.SearchForEmployment.service.UserService;
import org.springframework.stereotype.Service;

@Service("firstService")
public class UserServiceImpl implements UserService {

    public String addNewName(String name){
        return name + " loshara";
    }
}

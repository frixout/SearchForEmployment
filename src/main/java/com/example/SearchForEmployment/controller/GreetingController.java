package com.example.SearchForEmployment.controller;

import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/register")
public class GreetingController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public String greetingController(Model model) {
        model.addAttribute("user", new User());
        return "signUp";
    }
    @PostMapping
    public String registerUser(User user, Model model){
        userRepository.save(user);
        User byEmail = userRepository.findByEmail(user.getEmail());
        System.out.println(byEmail);
        return "redirect:/register";
    }
}

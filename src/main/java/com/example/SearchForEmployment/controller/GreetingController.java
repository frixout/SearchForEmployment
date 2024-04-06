package com.example.SearchForEmployment.controller;

import com.example.SearchForEmployment.model.entity.TestUser;
import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.repository.TestUserRepository;
import com.example.SearchForEmployment.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping(value = "/greeting/register")
public class GreetingController {
    @Autowired
    private TestUserRepository userRepository;
    @GetMapping
    public String greetingController(Model model) {
        model.addAttribute("user", new TestUser());
        return "signUp";
    }
    @PostMapping
    public String registerUser(TestUser user, Model model){
        userRepository.save(user);
        TestUser byEmail = userRepository.findByEmail(user.getEmail());
        System.out.println(byEmail);
        return "redirect:/index";
    }
}

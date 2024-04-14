package com.example.SearchForEmployment.controller;

import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.repository.UserRepository;
import com.example.SearchForEmployment.service.UserService;
import jakarta.validation.Valid;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/greeting/register")

public class RegisterController {
    @Autowired
    @Qualifier("firstService")
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    private final String message = "Пользователь с таким email уже существует";


    @GetMapping
    public String registerController(Model model) {
        model.addAttribute("user", new User());
        return "signUp";
    }
    @PostMapping
    public String registerUser(@Valid User user,  BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("user", user);
            model.addAttribute("errors", bindingResult.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .toList());
            return "signUp";
        } else if (!(userRepository.findByEmail(user.getEmail())==null)) {
            model.addAttribute("user", user);
            model.addAttribute("emailError", message);
            return "signUp";
        }else{
            userService.registerUser(user);
            return "redirect:/greeting/register";
        }
    }
}

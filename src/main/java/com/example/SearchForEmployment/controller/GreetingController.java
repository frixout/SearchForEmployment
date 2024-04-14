package com.example.SearchForEmployment.controller;


import com.example.SearchForEmployment.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/greeting/index")
public class GreetingController {
    @GetMapping
    public String greetingController() {
        return "index";
    }
}

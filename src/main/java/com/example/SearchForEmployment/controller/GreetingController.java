package com.example.SearchForEmployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    @RequestMapping(value = "/greeting")
    public String greetingController(@RequestParam(name = "name", required = false, defaultValue = "Гость") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    /*@PostMapping(value = "/register")
    public*/
}

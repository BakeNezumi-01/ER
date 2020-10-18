package com.example.ER.controller;

import com.example.ER.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String home(Map<String, Object> model) {
        model.put("userList", userRepository.findAll());

        return "home";
    }


}

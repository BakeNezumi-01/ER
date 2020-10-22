package com.example.ER.controller;

import com.example.ER.domain.Student;
import com.example.ER.domain.User;
import com.example.ER.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        model.put("userList", userRepository.findAll());

        return "home";
    }

    @GetMapping("/registration")
    public String registration(Map<String, Object> model) {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(Student student, Map<String, Object> model) {
        User userFromDb = userRepository.findByUsername(student.getUsername());

        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        userRepository.save(student);

        return "/home";
    }


}

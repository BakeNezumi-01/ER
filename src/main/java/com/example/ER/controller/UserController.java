package com.example.ER.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    @PostMapping("/login")
    public boolean login(@RequestBody String username, String password) {
        return
                username.equals("user") && password.equals("password");
    }
}

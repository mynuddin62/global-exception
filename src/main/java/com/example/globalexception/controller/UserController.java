package com.example.globalexception.controller;

import com.example.globalexception.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable String id) {
        if ("123".equals(id)) {
            return "User Found";
        } else {
            throw new ResourceNotFoundException("User with ID " + id + " not found");
        }
    }
}

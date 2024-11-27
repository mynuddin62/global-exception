package com.example.globalexception.controller;

import com.example.globalexception.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable String id) {
        if ("123".equals(id)) {
            return "User Found";
        } else {
            logger.error("User not found with ID: {}", id);
            throw new ResourceNotFoundException("User with ID " + id + " not found");
        }
    }
}

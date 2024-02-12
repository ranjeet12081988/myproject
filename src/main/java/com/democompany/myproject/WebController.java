package com.democompany.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // This will return the index.html file
    }

    @GetMapping("/register")
    public String registerForm() {
        return "register"; // This will return the register.html file
    }
}

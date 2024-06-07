package com.alke.alkewallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/registro")
    public String registro(Model model) {
        return "registro";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

package com.token.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest1 {

    @RequestMapping("/c3/t1")
    public String Test(Model model) {
        model.addAttribute("msg", "ControllerTest1");
        return "test";
    }
}

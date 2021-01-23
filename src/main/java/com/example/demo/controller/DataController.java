package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DataController {
    private Random random;

    public DataController() {
        random = new Random();
    }

    @GetMapping("/")
    public String data(Model model) {
        MyData myData = new MyData(random.nextInt(100), "Cezary", "Witkowski", "Software Developer");
        model.addAttribute("myData", myData);
        return "data";
    }
}
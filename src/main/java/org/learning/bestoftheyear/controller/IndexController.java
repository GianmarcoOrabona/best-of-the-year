package org.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("year_recap")
    public String getDate(Model model) {
        model.addAttribute("year", 2023);
        model.addAttribute("name", "Gianmarco");
        return "year_recap";
    }
}

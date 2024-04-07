package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabController {

    @GetMapping("/lab")
    public String getLabs(Model model){
        model.addAttribute("firstLab", "lab-01-Coupling");
        model.addAttribute("secondLab", "lab-02-IoC");
        model.addAttribute("thirdLab", "lab-03-DI");
        model.addAttribute("fourthLab", "lab-04-SpringBoot");
        model.addAttribute("fifthLab", "lab-05-Spring MVC");

        return "lab/lab-list";
    }
}

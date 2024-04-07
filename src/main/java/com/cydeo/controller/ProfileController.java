package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String profile(Model model){

        Profile profile = new Profile();
        profile.setName("John");
        profile.setSurname("Doe");
        profile.setUserName("john-doe");
        profile.setPhoneNumber("0123456789");
        profile.setEmail("johndoe@cydeo.com");
        profile.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile", profile);

        return "profile/profile-info";
    }
}

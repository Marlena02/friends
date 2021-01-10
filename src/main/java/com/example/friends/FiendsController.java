package com.example.friends;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FiendsController {

    @GetMapping("/friends")
    public String friendForm(Model model) {
        model.addAttribute("person", new Person());
        return "friendsForm";
    }

    @PostMapping("/friends")
    public String submissionResult(@ModelAttribute("person") Person person) {
        return "result";
    }
}

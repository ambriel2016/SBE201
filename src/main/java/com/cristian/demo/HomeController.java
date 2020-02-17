package com.cristian.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/emailform")
    public String loadFormPage(){
        return "emailtemplate";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("email") String email, Model model){
        model.addAttribute("emailval", email);
        return "emailconfirm";
    }
}

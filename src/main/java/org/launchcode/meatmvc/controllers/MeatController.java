package org.launchcode.meatmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("meat")
public class MeatController {

    //Request path: /meat
    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("title", "My Meat");
        return "meat/index";
    }
}

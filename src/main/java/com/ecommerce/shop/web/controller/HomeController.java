package com.ecommerce.shop.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/say-hello")
    public @ResponseBody
    String getWelcomeMessage(){
        return "welcome to my first spring application";
    }
}

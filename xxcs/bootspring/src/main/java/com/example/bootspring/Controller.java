package com.example.bootspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/busy/")
public class Controller {
    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
}

package com.barss.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTMP {

    @GetMapping("/")
    public String getStrona(){
        return "Hello!";
    }
}

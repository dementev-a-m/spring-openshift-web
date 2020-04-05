package ru.dementev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${hello.world:Hello World}")
    private String hello;

    @GetMapping("/testing")
    public String testing(){
        return hello;
    }


}

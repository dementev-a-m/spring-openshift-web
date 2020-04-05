package ru.dementev.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {
    @Value("${hello.world:Hello World}")
    private String hello;

    @GetMapping("/testing")
    public String testing(){
        log.info("Response " + hello);
        return hello;
    }


}

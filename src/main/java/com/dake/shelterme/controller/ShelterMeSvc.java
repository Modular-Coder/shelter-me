package com.dake.shelterme.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class ShelterMeSvc {

    @RequestMapping("hello")
    public String helloWorld() {
        return "hello world";
    }
}

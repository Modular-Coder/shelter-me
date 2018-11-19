package com.dake.shelterme.controller;

import com.dake.shelterme.data.Shelter;
import com.dake.shelterme.data.ShelterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@AllArgsConstructor
public class ShelterController {
    private ShelterRepository shelterRepository;

    @GetMapping("/hello")
    public Iterable<Shelter> helloWorld() {
        return shelterRepository.findAll();
    }

    @RequestMapping(value = "/api/public")
    public String publicEndpoint() {
        return "public endpoint called!";
    }

    @RequestMapping(value = "/api/private")
    public String privateEndpoint() {
        return "private endpoint called!";
    }

    @RequestMapping(value = "/api/private-scoped")
    public String privateScopedEndpoint() {
        return "private-scoped endpoint called!";
    }

    @RequestMapping(value = "/callback")
    public String callBack() {
        return "Call back success!";
    }
}

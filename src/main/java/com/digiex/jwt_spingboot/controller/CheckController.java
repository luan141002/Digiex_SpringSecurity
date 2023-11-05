package com.digiex.jwt_spingboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checking-secure-api")
public class CheckController {
    @GetMapping
    public String getHello(){
        return "Hello World";
    }
}

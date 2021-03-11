package com.example.eurekaclient3.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PotatoController {
    @GetMapping("/potato")
    public String getPotato() {
        return "Hello I'm a Potato called Patata";
    }
}

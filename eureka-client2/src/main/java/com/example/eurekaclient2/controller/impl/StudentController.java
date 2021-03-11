package com.example.eurekaclient2.controller.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin("*")
public class StudentController {

    @GetMapping("/students")
    public String getRandomUser() {
        String students[] = {"Adrián Maza Vázquez", "Galo Garcia Pugliese", "Daniel Juan", "Juan Carlos Izurieta", "Carolina Siguiri Quesada", "Ester Naranjo", "Julia Lopez", "Nerea Garcia", "Aliany Creaspo", "Javier García", "Silvia Sánchez Heras", "Paloma Torres", "Celia Lumbreras Herrera", "Julia García", "Claudia Doñate", "Angel Serrano", "Coby Sardinero Meirás", "Paul Barroso Gomez", "Rubén Navarro Navalón", "Alejandro Martínez", "Adria Lopez", "Jaume Sánchez Torres", "Salvatore Corsaro", "Antonio Navarro", "Iván Trujillo"};

        return students[new Random().nextInt(students.length)];
     }

}

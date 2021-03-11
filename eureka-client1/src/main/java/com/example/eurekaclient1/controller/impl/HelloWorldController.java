package com.example.eurekaclient1.controller.impl;

import com.example.eurekaclient1.client.EurekaClient2Client;
import com.example.eurekaclient1.client.JSONPlaceHolderClient;
import com.example.eurekaclient1.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HelloWorldController {

    @Autowired
    private EurekaClient2Client eurekaClient2Client;

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World... from server ;)";
    }

    @GetMapping("/hello-world-pro")
    public String helloWorldPro() {
        return "Hello " + eurekaClient2Client.getRandomUser();
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }
}

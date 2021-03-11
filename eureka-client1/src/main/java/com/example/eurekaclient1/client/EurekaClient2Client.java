package com.example.eurekaclient1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client2", url = "https://lit-reef-19062.herokuapp.com/")
//@FeignClient("eureka-client2")
public interface EurekaClient2Client {
    @GetMapping("/students")
    String getRandomUser();
}

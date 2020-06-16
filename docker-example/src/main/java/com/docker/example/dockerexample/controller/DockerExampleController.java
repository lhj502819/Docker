package com.docker.example.dockerexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/dockerExampleController")
@RestController
public class DockerExampleController {
    @Value("${application.name}")
    private String applicationName;

    private AtomicInteger count = new AtomicInteger();

    @RequestMapping("/testDocker/{userName}")
    public String testDocker( @PathVariable("userName") String userName){
        String responseString = String.format("Welcome to %s，Hello %s，totalInvite ： %s", applicationName, userName, count.incrementAndGet());
        return responseString;
    }
}

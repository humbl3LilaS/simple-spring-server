package com.edelweiss.app.controller;

import com.edelweiss.app.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController
{

    Greeting greetingService;

    public HelloWorldController(Greeting greetingService)
    {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String hello()
    {
        return greetingService.greet();
    }
}

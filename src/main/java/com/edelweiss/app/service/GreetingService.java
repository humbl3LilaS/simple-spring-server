package com.edelweiss.app.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements Greeting
{
    @Override
    public String greet()
    {
        return "Greetings from Spring Boot!";
    }
}

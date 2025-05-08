package com.reso.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {

    public String helloWord(String name){
        return "Hello word Service! " + name;
    }
}

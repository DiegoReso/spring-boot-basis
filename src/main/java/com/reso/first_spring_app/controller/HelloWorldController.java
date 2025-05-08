package com.reso.first_spring_app.controller;


import com.reso.first_spring_app.domain.User;
import com.reso.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWorld(){
        return helloWordService.helloWord("Diego");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @PathVariable(
            "id") String id,
                                 @RequestBody User body){
        return "Hello World Post " + body.getName() + " " + id + " " + filter;
    }

}

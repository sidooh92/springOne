package com.start.springOne.controller;


import com.start.springOne.dto.PersonDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello world!!!";
    }


    @RequestMapping("/person")
    public PersonDto personDto
            (@RequestParam(value = "name") String name) {
        return new PersonDto(10, name);
    }


}

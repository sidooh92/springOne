package com.start.springOne.controller;


import com.start.springOne.dto.PersonDto;
import com.start.springOne.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    private PersonRepository personRepository;

    @Autowired
    public HelloController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!!!";
    }


    @RequestMapping("/person")
    public Optional<PersonDto> findPersonById
            (@RequestParam(value = "id") int id) {
        return personRepository.findById(Long.valueOf(id));
    }


}

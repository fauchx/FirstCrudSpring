package com.stdexample.Person;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    @Autowired
    private final PersonService personService;
    @PostMapping("/create")
    public void CreatePersona(@RequestBody Person person){
        personService.CreatePersona(person);
    }
    @GetMapping("/")
    public List<Person> GetAllPersona(){
        return personService.GetAllPersona();
    }
    @GetMapping("/{id}")
    public Optional<Person> GetById(@PathVariable("id") Integer personId ){
        return personService.FindById(personId);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer personId){
        personService.deletePerson(personId);
    }
}

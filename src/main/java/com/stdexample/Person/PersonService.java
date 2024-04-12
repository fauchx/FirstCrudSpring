package com.stdexample.Person;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepo;
    public void CreatePersona(Person person){
        personRepo.save(person);
    }

    public Optional<Person> FindById(Integer id){
        return personRepo.findById(id);

    }

    public void deletePerson(Integer id){
        personRepo.deleteById(id);
    }
    public List<Person> GetAllPersona(){
       return personRepo.findAll();
    }
}

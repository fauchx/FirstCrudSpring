package com.stdexample.Person;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class Person {
    @Id
    @GeneratedValue 
    private Integer id;
    @Basic
    private String name;
    private String lastname;
    private String email;
}

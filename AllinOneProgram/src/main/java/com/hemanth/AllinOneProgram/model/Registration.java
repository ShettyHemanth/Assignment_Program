package com.hemanth.AllinOneProgram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

@NoArgsConstructor

public class Registration
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int rid;

    String name;

    String email;



    int year;

    public Registration(String name, String email, int year) {
        this.name = name;
        this.email = email;
        this.year = year;
    }


}

package com.pryjda.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    private String name;
    private String lastName;
    private int age;
    private Appearance looks;

}

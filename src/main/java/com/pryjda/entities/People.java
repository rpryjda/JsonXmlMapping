package com.pryjda.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class People {

    private List<Person> personList;

}

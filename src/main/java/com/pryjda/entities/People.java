package com.pryjda.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class People {

    @JacksonXmlElementWrapper(localName = "list")
    @JacksonXmlProperty(localName = "person")
    private List<Person> personList;

}

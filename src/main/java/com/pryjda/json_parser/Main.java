package com.pryjda.json_parser;

import com.pryjda.entities.Appearance;
import com.pryjda.entities.People;
import com.pryjda.entities.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ReadWriteJson jsonInstance = new ReadWriteJson();

        Person personFirst = new Person();
        personFirst.setName("Mike");
        personFirst.setLastName("Tyson");
        personFirst.setAge(33);

        Appearance looks1 = new Appearance();
        looks1.setDescription("Nice man");
        looks1.setHeight(180);

        personFirst.setLooks(looks1);

        Person personSecond = new Person();
        personSecond.setName("John");
        personSecond.setLastName("Smith");
        personSecond.setAge(28);

        Appearance look2 = new Appearance();
        look2.setDescription("Nice man");
        look2.setHeight(190);

        personSecond.setLooks(look2);

        Person personThrid = new Person();
        personThrid.setName("Joseph");
        personThrid.setLastName("Brown");
        personThrid.setAge(35);

        Appearance looks3 = new Appearance();
        looks3.setDescription("Nice man");
        looks3.setHeight(180);

        personThrid.setLooks(looks3);

        People peopleGroup = new People();
        peopleGroup.setPersonList(Arrays.asList(personFirst,personSecond,personThrid));

        jsonInstance.writeObjectToJsonFile(peopleGroup,"src\\main\\resources\\people.json_parser");
        People groupOfPeople = jsonInstance.readJsonFromFileToObject("src\\main\\resources\\file.json_parser");

        System.out.println(groupOfPeople);
        String jsonString = jsonInstance.writeObjectToJsonString(groupOfPeople);
        System.out.println(jsonString);

        People anotherGroupOfPeople = jsonInstance.readJsonFromStringToObject(jsonString);
        System.out.println(anotherGroupOfPeople);
        String anotherJsonString = jsonInstance.writeObjectToJsonString(anotherGroupOfPeople);
        System.out.println(anotherJsonString);

    }
}

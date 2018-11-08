package com.pryjda.xml_parser;

import com.pryjda.entities.Appearance;
import com.pryjda.entities.People;
import com.pryjda.entities.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Creating objects:

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
        peopleGroup.setPersonList(Arrays.asList(personFirst, personSecond, personThrid));

        //XML PARSING:

        ReadWriteXml xmlInstance = new ReadWriteXml();

        xmlInstance.writeXmlFromObjectToFile(peopleGroup, "src\\main\\resources\\file.xml");

        String xmlString = xmlInstance.writeXmlFromObjectToString(peopleGroup);
        System.out.println(xmlString);

        People peopleGroupSecond = xmlInstance.readXmlFromFileToObject("src\\main\\resources\\people.xml");
        System.out.println(peopleGroupSecond);
        String xmlStrinSecond = xmlInstance.writeXmlFromObjectToString(peopleGroupSecond);
        System.out.println(xmlStrinSecond);

        People peopleGroupThird = xmlInstance.readXmlFromStringToObject(xmlString);
        System.out.println(peopleGroupThird);

    }
}

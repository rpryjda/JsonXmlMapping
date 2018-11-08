package com.pryjda.xml_parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pryjda.entities.People;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteXml {

    public <T> void writeXmlFromObjectToFile(T obj, String path) {
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileOutputStream(path), obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public People readXmlFromFileToObject(String path) {
        XmlMapper mapper = new XmlMapper();
        People people = null;
        try {
            people = mapper.readValue(new FileInputStream(path), People.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public <T> String writeXmlFromObjectToString(T obj) {
        XmlMapper mapper = new XmlMapper();
        String xmlString = null;
        try {
            xmlString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return xmlString;
    }

    public People readXmlFromStringToObject(String xmlString) {
        XmlMapper mapper = new XmlMapper();
        People people = null;
        try {
            people = mapper.readValue(xmlString, People.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }


}

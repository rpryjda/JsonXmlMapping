package com.pryjda.json_parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pryjda.entities.People;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteJson {

    public People readJsonFromStringToObject(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        People people = null;
        try {
            people = mapper.readValue(jsonString, People.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public People readJsonFromFileToObject(String path) {
        ObjectMapper mapper = new ObjectMapper();
        People people = null;
        try {
            people = mapper.readValue(new FileInputStream(path), People.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public <T> String writeObjectToJsonString(T obj) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public <T> void writeObjectToJsonFile(T obj, String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new FileOutputStream(path), obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

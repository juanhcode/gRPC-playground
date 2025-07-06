package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import  com.example.demo.Person;

public class SimpleProtoDemo {

    private static final Logger logger = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {

        Person person = Person.newBuilder()
                .setName("John Doe")
                .setAge(18)
                .setEmail("Hola")
                .build();

        logger.info("Person: {}", person);
    }
}

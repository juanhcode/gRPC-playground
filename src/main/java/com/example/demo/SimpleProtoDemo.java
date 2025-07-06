package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import  com.example.demo.Person;

public class SimpleProtoDemo {

    private static final Logger logger = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {

        //Create person 1
        Person person1 = createPerson("Alice", 30, "alice@gmail.com");
        logger.info("Person 1: {}", person1);
        // Create person 2
        Person person2 = createPerson("Bob", 25, "bob@gmail.com");
        logger.info("Person 2: {}", person2);

        //compare persons
        logger.info("Equals: {}", person1.equals(person2));

        //Create person with different values
        Person person3 = person1.toBuilder().setName("Pepe").build();
        logger.info("Person 3: {}", person3);
    }

    private static Person createPerson(String name, int age, String email) {
        return Person.newBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .build();
    }
}

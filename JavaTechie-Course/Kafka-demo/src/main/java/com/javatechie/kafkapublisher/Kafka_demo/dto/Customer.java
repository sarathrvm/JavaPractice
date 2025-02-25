package com.javatechie.kafkapublisher.Kafka_demo.dto;


import lombok.*;

@Data

public class Customer {

    private int id;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer(String city, String email, String age, String name, int id) {
        this.city = city;
        this.email = email;
        this.age = age;
        this.name = name;
        this.id = id;
    }

    private String name;
    private String age;
    private String email;
    private String city;
}

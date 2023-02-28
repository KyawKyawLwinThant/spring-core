package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {


    private String name="Thaw Thaw";


    @PostConstruct
    public void init(){
        System.out.println("PostConstruct:Address::"+ add.getClass()
                .getSimpleName());
    }

    private final Address add;

    public Person(Address add) {
        this.add = add;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }



    public String personInfo(){
        return name +"::"+ add.getStreetName();
    }









}

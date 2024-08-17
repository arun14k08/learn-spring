package com.learn.spring_boot;


public class Dev {

    private int age;
    Laptop laptop;
    public Dev(){
        System.out.println("dev constructor");
    }

    // required for constructor injection
    public Dev(int age, String name){
        this.age = age;
        System.out.println(name);
    }

    // required for setter injection to work properly
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    public void build(){
        System.out.println("From Dev");

    }
}

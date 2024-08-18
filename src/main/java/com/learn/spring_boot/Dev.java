package com.learn.spring_boot;


public class Dev {

    private int age;
    Computer computer;

    public Dev(){
        System.out.println("dev constructor");
    }

    // required for constructor injection
//    public Dev(int age, Laptop laptop){
//        this.age = age;
//        this.laptop = laptop;
//        System.out.println("dev parameterized constructor called");
//    }

    // required for setter injection to work properly
    public void setAge(int age){
        this.age = age;
    }

    // required for setter injection


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge(){
        return age;
    }


    public void build(){
        System.out.println("From Dev");
        computer.compute();
    }
}

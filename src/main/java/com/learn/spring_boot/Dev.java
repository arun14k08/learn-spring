package com.learn.spring_boot;


public class Dev {

    private int age;
    Laptop laptop;

    public Dev(){
        System.out.println("dev constructor");
    }

    // required for constructor injection
    public Dev(int age, Laptop laptop){
        this.age = age;
        this.laptop = laptop;
        System.out.println("dev parameterized constructor called");
    }

    // required for setter injection to work properly
    public void setAge(int age){
        this.age = age;
    }

    // required for setter injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }




    public int getAge(){
        return age;
    }


    public void build(){
        System.out.println("From Dev");
        laptop.compute();
    }
}

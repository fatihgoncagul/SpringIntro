package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;
    // we can write new Laptop() to create this object
    // but we are using spring so we want spring to do it to inject it
    //<property name="lap" ref="lap"></property> we write this into alien1 bean's properties in xml config
    // this is called reference injection
    // now we'll talk about constructor injection
    // we change Laptop to Computer Interface, which will be useful cause it can be
    // desktop or laptop or even glass with computer in it so we wont have to change the Alien class
/*    @ConstructorProperties({"age","lap"})
    public Alien(int age,Laptop lap) {
        System.out.println("Para Constructor Called");
        this.age = age;
        this.lap = lap;
    }*/


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("object created");
    }

    public void code(){
        System.out.println("coding...");
        com.compile();
    }

}

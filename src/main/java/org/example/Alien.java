package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component // With this annotation we tell spring to handle this object and this saves us from too many configurations

public class Alien {

    @Value("21") // injecting value
    private int age;


    @Autowired
    @Qualifier("laptop") //class name with first letter small or we can set primary bean instead of this // we can also give a name to the bean and pass that name here
    // for example @Component("computer1")
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

    @Autowired // this is preferrred
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
        System.out.println("Alien object created.");
    }


    public void code(){

        com.compile();
        System.out.println("coding...");
    }

}

package org.example;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("laptop created");
    }

    public  void compile(){
        System.out.println("compiling using laptop");
    }
}

package com.java.functionalintefaces;


interface Shape {
    void draw();
}


public class LambdaExample {

    public static void main(String[] args) {


        Shape rectangle = () -> System.out.println("rectangle draw method");

        rectangle.draw();


    }
}

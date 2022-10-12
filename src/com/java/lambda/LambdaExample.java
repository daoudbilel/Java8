package com.java.lambda;


interface Shape {
    void draw();

}

public class LambdaExample {

    public static void main(String[] args) {

        print(() -> System.out.println("Rectangle class : draw()method"));
        print(() -> System.out.println("Square class : draw()method"));
        print(() -> System.out.println("Circle class : draw()method"));

    }

    private static void print(Shape shape) {
        shape.draw();
    }


}

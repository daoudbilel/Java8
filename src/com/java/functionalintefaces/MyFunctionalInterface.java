package com.java.functionalintefaces;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);


    default void method1() {
        System.out.println("Default method");
    }

    static void method2() {
        System.out.println("Static method");
    }
}

package com.java.functionalintefaces;

import java.util.function.Consumer;


public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Hello world!");

    }


}

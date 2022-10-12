package com.java.methodereference;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface Printable {
    void print(String msg);
}


public class MethodReferenceDemo {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }


    public static int addition(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {

        //*****************************************************************
        // Method  Reference to Static method
        //*****************************************************************

        // 1. Method reference to a static method

        // Lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));


        // using method reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));


        //lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

        // using method reference
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferenceDemo::addition;
        System.out.println(biFunctionMethodRef.apply(10, 20));


        //*****************************************************************
        // Method  Reference to an instance  method Of Object
        //*****************************************************************

        // 2. Method reference  to an instance  method Of Object

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // lambda Expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("Hello world !");

        // using method reference

        Printable printableMethodRef = methodReferenceDemo::display;
        printableMethodRef.print("Hello world with method ref!");


        //*****************************************************************
        // Method  Reference to the instance  method Of an Arbitrary Object
        //Sometimes, we call a method of argument in the lambda expression.
        //in that case , we can use a method reference  to call an instance.
        //method of an arbitrary object of specific type .
        //*****************************************************************

        // 3. Method reference  to the instance  method Of an Arbitrary Object

        // lambda Expression
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Java Guides"));

        // using method reference
        Function<String, String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("Java Guides With Method REF"));


        // autre example

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        // lambda Expression
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // using method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);


        //*****************************************************************
        // Method  Reference to a Constructor
        //*****************************************************************

        // 4. Method reference  to a constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");

        // lambda Expression
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        // using method reference
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));


    }
}

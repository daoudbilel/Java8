package com.java.lambda;

interface Addable {
    int addition(int a, int b);

}


public class LambdaParameters {

    public static void main(String[] args) {

        calculer((int a, int b) -> (a + b));
    }

    public static void calculer(Addable addable) {
        int result = addable.addition(10, 20);
        System.out.println(result);
    }
}

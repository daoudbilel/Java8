package com.java.lambda;


class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method called ....");
    }

    public String test(){
        return null;
    }
}


public class RunnableLambdaExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Thread threadLambda = new Thread(() -> System.out.println("Run method called using lambda"));
        threadLambda.start();
    }
}

package com.java.defaultstatic;

interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();


    static String getCompany() {
        return "BMW Company";
    }

    default String turnAlarmOn() {
        return "turning vehicle alarm on ";
    }

    default String turnAlarmOff() {
        return "turning vehicle alarm off ";
    }


}


class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "the car is speeding Up ";
    }

    @Override
    public String slowDown() {
        return "the car is slowing Down ";

    }


}


public class DefaultDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        System.out.println(Vehicle.getCompany());
    }


}

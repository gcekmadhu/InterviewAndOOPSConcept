package com.oops.concept.Inheritance.CarExm;

public class Car extends Vehicle {

    public void start(){
        System.out.println("Car -- Start");
    }
    public void stop(){
        System.out.println("Car -- stop");
    }
    public void refuel(){
        System.out.println("Car -- refuel");
    }
    public static void getName(){
        System.out.println("car name");
    }
}

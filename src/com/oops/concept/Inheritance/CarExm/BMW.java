package com.oops.concept.Inheritance.CarExm;

public class BMW extends Car{

    @Override
    public void start(){
        System.out.println("BMW-- start");
    }
    public static void getName(){
        System.out.println("BMW name");
    }
    public void autoParking(){
        System.out.println("BMW-- autoPark");
    }
}

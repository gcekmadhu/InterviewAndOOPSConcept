package com.oops.concept.Inheritance.CarExm;

public class TestCar {
    public static void main(String[] args){
        BMW bmw=new BMW();
        bmw.start(); //overridden method
        bmw.stop(); //inherited method
        bmw.refuel(); //inherited method
        bmw.autoParking(); //individual method
        bmw.engine(); //Multilevel inheritance

        BMW.getName();

        Car car=new Car();
        car.start(); //parent class start will be called
        car.stop();  //parent class stop will be called
        car.refuel();  //parent class refuel will be called
        Car.getName();
        car.engine(); //car direct child of Vehicle class
        Car carnew=new BMW();
        carnew.refuel();
        carnew.stop();
        carnew.start();

        Vehicle v=new BMW();
        v.engine();

        Audi audi=new Audi();
        audi.start();
        audi.stop();
        audi.refuel();
        audi.childLock();
    }
}

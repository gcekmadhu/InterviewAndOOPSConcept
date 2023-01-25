package com.keyword.conceptStatic;

public class Car {

    String name;
    String color;
    int price;
    static int wheels=4;

    public static void main(String[] args){
        Car c1=new Car();
        c1.color="red";
        c1.name="hyundai";
        c1.price=10;
        wheels=5;

        Car c2=new Car();
        c2.color="blue";
        c2.name="bmw";
        c2.price=100;


        Car c3=new Car();
        c3.color="white";
        c3.name="audi";
        c3.price=1000;
       

    }
}



package com.oops.concept.constructor;

public class Parent extends Grand {
    public Parent(){
        System.out.println("Parent constructor");
    }
    @Override
    public void add(){
        System.out.println("Add parent");
    }
}

package com.oops.concept.constructor;

public class Child extends Parent {
    public Child(){
        System.out.println("Child constructor");
    }
    public static void main(String args[]){
        Child c=new Child();
        c.add();
    }

}

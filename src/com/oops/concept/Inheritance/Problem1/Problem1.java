package com.oops.concept.Inheritance.Problem1;

public class Problem1 {

    //We have 3 Classes A, B an C.
    // Class C extends Class B and Class B extends Class A.
    // Each class has an method add(), is there a way to call A's add() method from Class C ?

    public static void main(String[] args){
        A a=new C();
        a.add();
    }
}

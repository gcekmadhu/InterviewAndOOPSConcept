package com.arrays;

import com.oops.concept.Inheritance.Problem1.A;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args){
        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add("Madhur");
        ar.add(200);
        System.out.println(ar);
        for(int i=0;i<ar.size();i++){

        }
        for(Object a: ar){
            System.out.println(a);
        }
    }
}

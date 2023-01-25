package com.exceptionhandling;

public class ThrowsConcept {
    public void m1(){
        m2();
    }
    public void m2(){
        try {
            m3();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void m3() throws ArithmeticException{
        int i=9/0;
    }
    public static void main(String[] args){
        ThrowsConcept throwsConcept=new ThrowsConcept();
        throwsConcept.m1();
        System.out.println("A");
    }
}

package com.exceptionhandling;

import java.io.FileNotFoundException;

public class FinallyKeywordConcept {

    public static void main(String[] args){
        int a=10;
        int b=0;
        System.out.println("before exception line");
        try {
            int i = a / b;
            System.out.println("After exception line");
        }
        //Below catch not allowed
        /*catch(Exception e){

        }*/
        catch (ArithmeticException e){
            System.out.println("hjhjhjh");
            e.printStackTrace();
        }
        catch(Exception e){

        }
        finally{
            System.out.println("finally line");
        }
    }
}

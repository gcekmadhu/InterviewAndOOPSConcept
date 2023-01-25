package com.exceptionhandling;

import java.util.concurrent.ExecutionException;

public class TryCatchBlockConcept {
    String name="Selenium";
    public static void main(String[] args) throws ArithmeticException{

        System.out.println("A");
        System.out.println("A");
        int i = 9 / 0;
        //At below line code will be terminated if not handled in try catch
        /*try {
            int i = 9 / 0;
            TryCatchBlockConcept tryCatchBlockConcept=null;
            System.out.println(tryCatchBlockConcept.name);

        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }*/
        System.out.println("B");
        System.out.println("B");
        System.out.println("B");

    }
}

package com.exceptionhandling;

public class ThrowKeywordConcept {

    public static void main(String[] args){
        try{
            throw new Exception("FILENOTFOUND");
        }
        catch (Exception e){
            System.out.println("Data not found");
            e.printStackTrace();
        }
    }
}

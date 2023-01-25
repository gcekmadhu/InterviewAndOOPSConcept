package com.exceptionhandling;

public class TestNewException {

    public static void main(String[] args) throws NegativeValueExceptionTest {
        int a=10;
        int b=0;
        try {
            throw new NegativeValueExceptionTest();
        }
        catch (NegativeValueExceptionTest e){
            e.printStackTrace();
        }


    }
}

package com.exceptionhandling;

public class Calculator {
    double result = 1;
    long value;
    long power(int n, int p) throws Exception {
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else if ((n>0 && p >0) || n==0 || p==0) {

            result = Math.pow(n, p);
            value= (new Double(result)).longValue();
            return value;
        }

        else if(n<0 || p<0) {
            throw new Exception("n or p should not be negative.");
        }
        throw new Exception("n or p should not be negative.");
    }
}

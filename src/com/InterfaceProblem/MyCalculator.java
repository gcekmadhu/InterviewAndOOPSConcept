package com.InterfaceProblem;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<9;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}

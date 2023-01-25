package com;

import com.oops.concept.Inheritance.Problem1.A;

import java.util.ArrayList;

class LeetCode1 {
    /*public void digitCount(String num) {
        int[] freqArr = new int[10];  // n = 10 given in constraints;


        for(char ch : num.toCharArray()){
            freqArr[ch-'0']++;
        }
        System.out.println(freqArr[2]);
        *//*for(int i=0;i<num.length();i++){
            int freq = num.charAt(i)-'0';  //freq of each indexValue;
            freqArr[i] = freqArr[i] - freq;
        }
        for(int i=0;i<10;i++){
            if(freqArr[i]!=0){
                return false;
            }
        }
        return true;*//*
    }
*/




    public static void main(String[] args){
        LeetCode1 lt=new LeetCode1();
        lt.digitCount("1210");
    }

    private void digitCount(String s) {
        char c;
        int m = 0;
        ArrayList ar=new ArrayList();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            System.out.println(c);
            m=Character.getNumericValue(c);
            ar.add(m);
        }
        System.out.println(ar);

        for(int i=0;i<ar.size();i++){
            int k= ar.indexOf(i);

        }

    }
}

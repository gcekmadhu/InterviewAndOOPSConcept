package com.arrays;

public class ArrayConcept {
    public static void main(String[] args){
        int a[]=new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
       // a[3]=40;
        //a[4]=50; //Throw exception ArrayIndexOutOfBound Runtime error

        System.out.println(a.length);
        System.out.println(a[3]);

        //print array
        /*for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/

        //foreach
        for(int k: a){
            System.out.println(k);
        }


        //String =1210
        System.out.println("------------------------------");
        int[] num=new int[10];
        String numbers="1210";
        System.out.println(numbers.length()+"*******");
        for(int i=0;i<4;i++){
            numbers.toCharArray();
            //System.out.println(numbers.charAt(i));
                    }
        System.out.println(num[0]);

    }
}

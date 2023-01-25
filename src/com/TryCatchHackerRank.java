package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);

        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z;
            z=x/y;
            System.out.print(z);
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

    }
}

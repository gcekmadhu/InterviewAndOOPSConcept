package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PyramidPattern {
    /**
     * Pattern is:
     -   *
     - *   *
     *   *   *
    *  *   *   *
     * @param args
     */

    public static void main(String args[]){
        for (int i=1;i<=4;i++){
            for (int j=4; j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
                //System.out.print(" ");


            }
            System.out.println("");

        }

        List<String> ab=new ArrayList<String>(Arrays.asList("abc","xyz"));
        System.out.println(ab);
    }
}

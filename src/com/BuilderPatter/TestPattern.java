package com.BuilderPatter;

public class TestPattern {
    public static void main(String[] args){
        Shopping shop=new Shopping();
        shop.login("Madhuri","abcd")
                .doSearch("iphone")
                .addToCart()
                .doPayment()
                .getOrderDetails("xyz")
                .logout();

        System.out.println("***************************************");
        Employee employee=new Employee();
        employee.getInfo().addName("Suvarna");
    }


}

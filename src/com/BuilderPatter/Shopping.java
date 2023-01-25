package com.BuilderPatter;

public class Shopping {

    public Shopping login(String un,String pwd){
        System.out.println("Login with"+un+" && "+pwd);
        return this;
    }
    public Shopping doSearch(String productName){
        System.out.println("Search for product"+productName);
        return this;
    }
    public Shopping addToCart(){
        System.out.println("added to cart");
        return this;
    }
    public Shopping doPayment(){
        System.out.println("Do payment");
        return this;
    }
    public Shopping getOrderDetails(String orderId){
        System.out.println("Search for order details"+orderId);
        return this;
    }
    public Shopping logout(){
        System.out.println("Logouttttt");
        return this;
    }

}

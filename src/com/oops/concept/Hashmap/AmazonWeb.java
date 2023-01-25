package com.oops.concept.Hashmap;

import com.oops.concept.Inheritance.Problem1.A;

import java.util.HashMap;

public class AmazonWeb {
    public void doLogin(String un,String pass){
        System.out.println("username is:"+un+" "+"password is:"+pass);
    }

    public HashMap<String, String> getUserCredentials(){
        HashMap<String,String> map=new HashMap<>();
        map.put("Customer","Madhuri:customer123");
        map.put("admin","Ashish:admin123");
        map.put("superuser","Chaya:superuser123");
        return map;
    }
    public static void main(String[] args){
        AmazonWeb amazonWeb=new AmazonWeb();
        String cred= amazonWeb.getUserCredentials().get("Customer");
        String credSplit[]=cred.split(":");
        String un=credSplit[0];
        String pass=credSplit[1];
        amazonWeb.doLogin(un,pass);

    }
}

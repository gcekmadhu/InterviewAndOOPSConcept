package com.BuilderPatter;

public class Employee {
    public Employee getInfo(){
        System.out.println("get info");
        return this;
    }
    public String getName(){
        return "Madhuri";
    }
    public void addName(String name){
        System.out.println("name"+name);
    }

}


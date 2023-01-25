package com.oops.concept.Abstract;

public class LoginPage extends Page{
    public LoginPage(){
        System.out.println("Login page constructor");
    }
    public LoginPage(String pageName){
        super(pageName);
        System.out.println("Login page constructor"+pageName);
    }

    @Override
    public void title() {
        System.out.println("Login page title");
    }

    @Override
    public void header() {
        System.out.println("Login page header");
    }
}

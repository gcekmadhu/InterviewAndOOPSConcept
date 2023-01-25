package com.oops.concept.Abstract;

public class TestPage {
    public static void main(String[] args) {
        //cannot create object of abstract class
        LoginPage p = new LoginPage();
        p.header();
        p.title();
        Page p2 = new LoginPage();
        p2.header();
        p2.title();
        System.out.println(p2.i);

        //access methods from abstract class
        Page p3=new LoginPage();
        p3.timeout();
        p3.footer();
        Page.getUrl();


//Parent class contrsuctor wont be called if super keyword with parameter is not used
        LoginPage param = new LoginPage("Loginnnnn");
    }

}

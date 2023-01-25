package com.oops.concept.Abstract;
//keyword for abstract class is abtract
public abstract class Page {
    int i=10;

    //You can create Constructor of abstract class
    public Page(){
        System.out.println("Default Constrcutor");
    }
    public Page(String pageName){
        System.out.println("overloaded Constrcutor"+pageName);
    }
    //abstract class can have 0 abstract methods
    public abstract void title();
    public abstract void header();

    public void timeout(){
        System.out.println("Page timeout is 20Sec");
    }
    public final void footer(){
        System.out.println("Page footer");
    }
    public static void getUrl(){
        System.out.println("Page url");
    }
}

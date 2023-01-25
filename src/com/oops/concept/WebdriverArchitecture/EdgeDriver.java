package com.oops.concept.WebdriverArchitecture;

public class EdgeDriver implements WebDriver{
    public EdgeDriver(){
        System.out.println("Launch EdgeDriver");
    }
    @Override
    public void findElement() {
        System.out.println("EdgeDriver findElement");
    }

    @Override
    public void findElements() {
        System.out.println("EdgeDriver findElements");
    }

    @Override
    public void launchUrl(String url) {
        System.out.println("EdgeDriver launchUrl"+url);
    }

    @Override
    public String getTitle() {
        System.out.println("EdgeDriver getTitle");
        return "Title of page";
    }

    @Override
    public void click() {
        System.out.println("EdgeDriver click");
    }

    @Override
    public void sendKeys() {
        System.out.println("EdgeDriver sendKeys");
    }

    @Override
    public void close() {
        System.out.println("EdgeDriver findElement");
    }
}

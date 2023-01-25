package com.oops.concept.WebdriverArchitecture;

public class FirefoxDriver implements WebDriver{
    public FirefoxDriver(){
        System.out.println("Launch FirefoxDriver");
    }
    @Override
    public void findElement() {
        System.out.println("FirefoxDriver findElement");
    }

    @Override
    public void findElements() {
        System.out.println("FirefoxDriver findElements");
    }

    @Override
    public void launchUrl(String url) {
        System.out.println("FirefoxDriver launchUrl"+url);
    }

    @Override
    public String getTitle() {
        System.out.println("FirefoxDriver getTitle");
        return "Title of page";
    }

    @Override
    public void click() {
        System.out.println("FirefoxDriver click");
    }

    @Override
    public void sendKeys() {
        System.out.println("FirefoxDriver sendKeys");
    }

    @Override
    public void close() {
        System.out.println("FirefoxDriver findElement");
    }
}

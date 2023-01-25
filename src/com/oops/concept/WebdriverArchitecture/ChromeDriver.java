package com.oops.concept.WebdriverArchitecture;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        System.out.println("Launch chrome");
    }
    @Override
    public void findElement() {
        System.out.println("Chrome driver findElement");
    }

    @Override
    public void findElements() {
        System.out.println("Chrome driver findElements");
    }

    @Override
    public void launchUrl(String url) {
        System.out.println("Chrome driver launchUrl"+url);
    }

    @Override
    public String getTitle() {
        System.out.println("Chrome driver getTitle");
        return "Title of page";
    }

    @Override
    public void click() {
        System.out.println("Chrome driver click");
    }

    @Override
    public void sendKeys() {
        System.out.println("Chrome driver sendKeys");
    }

    @Override
    public void close() {
        System.out.println("Chrome driver findElement");
    }

    public void executeExe(){
        System.out.println("Execute exe for chrome");
    }
}

package com.oops.concept.WebdriverArchitecture;

public interface WebDriver extends SearchContext{
    @Override
    public void findElement();

    @Override
    public void findElements();

    public void launchUrl(String url);
    public String getTitle();
    public void click();
    public void sendKeys();
    public void close();
}

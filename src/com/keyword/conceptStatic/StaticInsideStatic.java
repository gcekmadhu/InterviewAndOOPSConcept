package com.keyword.conceptStatic;

public class StaticInsideStatic {
    StaticInsideStatic.StaticClass obj=new StaticInsideStatic.StaticClass();



    public static class StaticClass{
        int i=10;
    }
}

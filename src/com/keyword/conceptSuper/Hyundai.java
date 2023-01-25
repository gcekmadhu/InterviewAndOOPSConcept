package com.keyword.conceptSuper;

public class Hyundai extends Car {

    public Hyundai(){
        super();
    }
    public void hyundaiCarSpeed(){
        super.speedLimitMax=110;
        System.out.println(super.speedLimitMax);
    }

}

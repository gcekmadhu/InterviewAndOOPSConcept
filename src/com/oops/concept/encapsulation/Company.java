package com.oops.concept.encapsulation;

public class Company {
    private String name;
    private int empCount;
    private String companyhq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public String getCompanyhq() {
        return companyhq;
    }

    public void setCompanyhq(String companyhq) {
        this.companyhq = companyhq;
    }
//Shouldnot access Company class from below
    /*public static void main(String[] args){
        Company obj=new Company();
        obj.name="IBM";
        obj.companyhq="Pune";
        obj.empCount=1000;

    }*/

    //Hence getter and setter
}

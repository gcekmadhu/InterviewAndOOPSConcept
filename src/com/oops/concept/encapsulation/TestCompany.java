package com.oops.concept.encapsulation;

import com.oops.concept.Inheritance.Problem1.C;

public class TestCompany {
    public static void main(String[] args){
        Company company=new Company();
        company.setName("Credit Suisse");
        System.out.println(company.getName());
        company.setCompanyhq("Pune");
        System.out.println(company.getCompanyhq());
        company.setEmpCount(100000);
        System.out.println(company.getEmpCount());
    }
}

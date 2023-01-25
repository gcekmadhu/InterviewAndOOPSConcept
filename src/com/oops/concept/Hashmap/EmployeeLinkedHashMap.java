package com.oops.concept.Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeLinkedHashMap {
    public static void main(String[] args){
        HashMap<String,String> employee=new LinkedHashMap<String,String>();
        //add value
        employee.put("QTP","Functional Testing Tool");
        employee.put("Selenium","Automation");
        employee.put("Jmeter", "Performance Testing");
        employee.put("Postman", "API Testing Tool");
        employee.put("Postman", "API DOC Testing Tool");
        employee.put(null, "TBC new tool");
        employee.put("Zalenium",null);
//Linked HashMap maintains order
        System.out.println(employee);


        //for each loop
        for(
                Map.Entry<String,String> e: employee.entrySet()){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+" "+value);
        }
    }
}

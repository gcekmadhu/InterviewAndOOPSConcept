package com.oops.concept.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

    public static void main(String[] args){
        HashMap<String,String> employee=new HashMap<String, String>();
        //add value
        employee.put("QTP","Functional Testing Tool");
        employee.put("Selenium","Automation");
        employee.put("Jmeter", "Performance Testing");
        employee.put("Postman", "API Testing Tool");
        employee.put("Postman", "API DOC Testing Tool");
        employee.put(null, "TBC new tool");
        employee.put("Zalenium",null);

        System.out.println(employee);

        //Fetch value
        System.out.println(employee.get("Postman"));

        //Duplicate keys gives latest value
        System.out.println(employee.get("Postman"));

        //null key
        System.out.println(employee.get(null));

        //null value
        System.out.println(employee.get("Zalenium"));

        //for each loop
        for(Map.Entry<String,String> e: employee.entrySet()){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+" "+value);
        }

        //Iterate HashMap using lambda
        employee.forEach((key,value)->System.out.println(key+" "+value));
    }
}

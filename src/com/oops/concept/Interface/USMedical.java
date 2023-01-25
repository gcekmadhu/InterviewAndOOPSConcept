package com.oops.concept.Interface;

public interface USMedical extends WHO{
    int minfees = 10;
    public void physioServices();
    public void oncology();
    public void dental();
    public void pedestrian();
    public void emergency();

    public static void medicalEquipment(){
        System.out.println("US Medical Equipment");
    }

}

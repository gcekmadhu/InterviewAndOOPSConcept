package com.oops.concept.Interface;

public interface UKMedical extends WHO{
    int minfees = 100;
    public void pediaServices();
    public void cardio();
    public void emergency();

    public static void medicalInsurance(){
        System.out.println("UK Medical Insurance");
    }
    //Default method can be overridden
    default void medicalEquipment(){
        System.out.println("UK Medical Equipment");
    }
}

package com.oops.concept.Interface;

public class TestHospital {
    public static void main(String[] args){
        FortisHospital fh=new FortisHospital();



        fh.cardio();
        fh.emergency();
        fh.dental();
        fh.skinCareServices();
        fh.helpdesk();
        fh.billingDept();
        fh.pandemicAnnouncement();
        System.out.println("UKMedical Fees "+UKMedical.minfees);
        USMedical.medicalEquipment();
        //Static methods can be called directly with Interface/Class name
        UKMedical.medicalInsurance();
        fh.medicalEquipment();

        UKMedical uk=new FortisHospital();


        uk.cardio();
        uk.emergency();
        uk.pediaServices();
    }
}

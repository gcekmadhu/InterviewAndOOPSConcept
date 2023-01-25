package com.oops.concept.Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical,INDMedical{
    @Override
    public void physioServices() {
        System.out.println("Fortis Hospital phsio services");
    }

    @Override
    public void oncology() {
        System.out.println("Fortis Hospital oncology services");
    }

    @Override
    public void dental() {
        System.out.println("Fortis Hospital dental services");
    }

    @Override
    public void pedestrian() {
        System.out.println("Fortis Hospital pedestrian services");
    }

    @Override
    public void emergency() {
        System.out.println("Fortis Hospital emergency services");
    }

    @Override
    public void pediaServices() {
        System.out.println("Fortis Hospital pedia services");
    }

    @Override
    public void cardio() {
        System.out.println("Fortis Hospital cardio services");
    }

    @Override
    public void neuroServices() {
        System.out.println("Fortis Hospital neuro services");
    }

    @Override
    public void orthoService() {
        System.out.println("Fortis Hospital ortho services");
    }

    @Override
    public void entServices() {
        System.out.println("Fortis Hospital ent services");
    }

    @Override
    public void helpdesk(){
        System.out.println("Fortis Hospital helpdesk ");
    }

    //Individual Methods
    public void skinCareServices(){
        System.out.println("Fortis Hospital skin care services");
    }

    @Override
    public void researchCovid() {
        System.out.println("Fortis Hospital research Covid");
    }
}

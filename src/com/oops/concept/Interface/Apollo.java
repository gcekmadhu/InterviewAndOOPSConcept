package com.oops.concept.Interface;

public class Apollo implements INDMedical {
    @Override
    public void neuroServices() {
        System.out.println("Apollo neuro services");
    }

    @Override
    public void orthoService() {
        System.out.println("Apollo ortho services");
    }

    @Override
    public void entServices() {
        System.out.println("Apollo ent services");
    }

    @Override
    public void emergency() {
        System.out.println("Apollo emergency services");
    }

    @Override
    public void researchCovid() {
        System.out.println("Apollo research Covid services");
    }
}

package com.jee.donationswebsite.model;

import com.jee.donationswebsite.entities.Affectation;
import com.jee.donationswebsite.entities.Association;
import com.jee.donationswebsite.entities.Personne;

public class Donation {

    private Affectation affectation;
    private Object objet;
    private Personne personne;
    private Association association;

    public Donation() {
    }

    public Donation(Affectation affectation, Object objet, Personne personne, Association association) {
        this.affectation = affectation;
        this.objet = objet;
        this.personne = personne;
        this.association = association;
    }

    public Affectation getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }

    public Object getObjet() {
        return objet;
    }

    public void setObjet(Object objet) {
        this.objet = objet;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "affectation=" + affectation +
                ", objet=" + objet +
                ", personne=" + personne +
                ", association=" + association +
                '}';
    }
}

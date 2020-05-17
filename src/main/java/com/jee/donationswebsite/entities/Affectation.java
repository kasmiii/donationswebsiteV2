package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "affectation")
@Table(name = "affectation")
public class Affectation {

    @Id
    @Column(name = "id_affectation")
    private String mIdAffectation;
    @Column(name = "date_affectation")
    private String mDateAffectation;
    @Column(name = "quantite_donnee")
    private int mQuantiteDonnee;
    @Column(name = "quantite_restee")
    private int mQuantiteRestee;
    @Column(name = "libelle_depot")
    private String mLibelleDepot;
    @Column(name = "cin_demandeur")
    private String mCinDemandeur;
    @Column(name = "cin_donateur")
    private String mCinDonateur;
    @Column(name = "id_objet")
    private String mIdObjet;

    public Affectation() { }

    public Affectation(String mIdAffectation, String mDateAffectation, int mQuantiteDonnee, int mQuantiteRestee, String mLibelleDepot, String mCinDemandeur, String mCinDonateur, String mIdObjet) {
        this.mIdAffectation = mIdAffectation;
        this.mDateAffectation = mDateAffectation;
        this.mQuantiteDonnee = mQuantiteDonnee;
        this.mQuantiteRestee = mQuantiteRestee;
        this.mLibelleDepot = mLibelleDepot;
        this.mCinDemandeur = mCinDemandeur;
        this.mCinDonateur = mCinDonateur;
        this.mIdObjet = mIdObjet;
    }

    public String getmIdAffectation() {
        return mIdAffectation;
    }

    public void setmIdAffectation(String mIdAffectation) {
        this.mIdAffectation = mIdAffectation;
    }

    public String getmDateAffectation() {
        return mDateAffectation;
    }

    public void setmDateAffectation(String mDateAffectation) {
        this.mDateAffectation = mDateAffectation;
    }

    public int getmQuantiteDonnee() {
        return mQuantiteDonnee;
    }

    public void setmQuantiteDonnee(int mQuantiteDonnee) {
        this.mQuantiteDonnee = mQuantiteDonnee;
    }

    public int getmQuantiteRestee() {
        return mQuantiteRestee;
    }

    public void setmQuantiteRestee(int mQuantiteRestee) {
        this.mQuantiteRestee = mQuantiteRestee;
    }

    public String getmLibelleDepot() {
        return mLibelleDepot;
    }

    public void setmLibelleDepot(String mLibelleDepot) {
        this.mLibelleDepot = mLibelleDepot;
    }

    public String getmCinDemandeur() {
        return mCinDemandeur;
    }

    public void setmCinDemandeur(String mCinDemandeur) {
        this.mCinDemandeur = mCinDemandeur;
    }

    public String getmCinDonateur() {
        return mCinDonateur;
    }

    public void setmCinDonateur(String mCinDonateur) {
        this.mCinDonateur = mCinDonateur;
    }

    public String getmIdObjet() {
        return mIdObjet;
    }

    public void setmIdObjet(String mIdObjet) {
        this.mIdObjet = mIdObjet;
    }

    @Override
    public String toString() {
        return "Affectation{" +
                "mIdAffectation='" + mIdAffectation + '\'' +
                ", mDateAffectation='" + mDateAffectation + '\'' +
                ", mQuantiteDonnee=" + mQuantiteDonnee +
                ", mQuantiteRestee=" + mQuantiteRestee +
                ", mLibelleDepot='" + mLibelleDepot + '\'' +
                ", mCinDemandeur='" + mCinDemandeur + '\'' +
                ", mCinDonateur='" + mCinDonateur + '\'' +
                ", mIdObjet='" + mIdObjet + '\'' +
                '}';
    }


}

package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
public class Demande {

    @Id
    @Column(name = "id_demande")
    private String mIdDemande;
    @Column(name = "date_demande")
    private String mDateDemande;
    @Column(name = "status")
    private String mStatus;
    @Column(name = "quantite")
    private int mQuantite;
    @Column(name = "id_objet")
    private String mIdObjet;
    @Column(name = "cin_demandeur")
    private String mCinDemandeur;

    public Demande() {}

    public Demande(String mIdDemande, String mDateDemande, String mStatus, int mQuantite, String mIdObjet, String mCinDemandeur) {
        this.mIdDemande = mIdDemande;
        this.mDateDemande = mDateDemande;
        this.mStatus = mStatus;
        this.mQuantite = mQuantite;
        this.mIdObjet = mIdObjet;
        this.mCinDemandeur = mCinDemandeur;
    }

    public String getmIdDemande() {
        return mIdDemande;
    }

    public void setmIdDemande(String mIdDemande) {
        this.mIdDemande = mIdDemande;
    }

    public String getmDateDemande() {
        return mDateDemande;
    }

    public void setmDateDemande(String mDateDemande) {
        this.mDateDemande = mDateDemande;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public int getmQuantite() {
        return mQuantite;
    }

    public void setmQuantite(int mQuantite) {
        this.mQuantite = mQuantite;
    }

    public String getmIdObjet() {
        return mIdObjet;
    }

    public void setmIdObjet(String mIdObjet) {
        this.mIdObjet = mIdObjet;
    }

    public String getmCinDemandeur() {
        return mCinDemandeur;
    }

    public void setmCinDemandeur(String mCinDemandeur) {
        this.mCinDemandeur = mCinDemandeur;
    }

    @Override
    public String toString() {
        return "Demande{" +
                "mIdDemande='" + mIdDemande + '\'' +
                ", mDateDemande='" + mDateDemande + '\'' +
                ", mStatus='" + mStatus + '\'' +
                ", mQuantite=" + mQuantite +
                ", mIdObjet='" + mIdObjet + '\'' +
                ", mCinDemandeur='" + mCinDemandeur + '\'' +
                '}';
    }
}

package com.jee.donationswebsite.entities;

import javax.persistence.*;

@Entity(name = "association")
@Table(name = "association")
public class Association {

    @Id
    @GeneratedValue
    @Column(name = "libelle_association")
    private String mLibelleAssociation;

    @Column(name = "nom_association")
    private String mNomAssociation;
    @Column(name = "adresse_local")
    private String mAdresseLocale;
    @Column(name = "cin")
    private String mCinPersonne;

    public Association() {}

    public Association(String mNomAssociation, String mAdresseLocale, String mCinPersonne) {
        this.mNomAssociation = mNomAssociation;
        this.mAdresseLocale = mAdresseLocale;
        this.mCinPersonne = mCinPersonne;
    }

    public String getmLibelleAssociation() {
        return mLibelleAssociation;
    }

    public void setmLibelleAssociation(String mLibelleAssociation) {
        this.mLibelleAssociation = mLibelleAssociation;
    }

    public String getmNomAssociation() {
        return mNomAssociation;
    }

    public void setmNomAssociation(String mNomAssociation) {
        this.mNomAssociation = mNomAssociation;
    }

    public String getmAdresseLocale() {
        return mAdresseLocale;
    }

    public void setmAdresseLocale(String mAdresseLocale) {
        this.mAdresseLocale = mAdresseLocale;
    }

    public String getmCinPersonne() {
        return mCinPersonne;
    }

    public void setmCinPersonne(String mCinPersonne) {
        this.mCinPersonne = mCinPersonne;
    }

    @Override
    public String toString() {
        return "Association{" +
                "mLibelleAssociation='" + mLibelleAssociation + '\'' +
                ", mNomAssociation='" + mNomAssociation + '\'' +
                ", mAdresseLocale='" + mAdresseLocale + '\'' +
                ", mCinPersonne='" + mCinPersonne + '\'' +
                '}';
    }

}

package com.jee.donationswebsite.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "depot")
@Table(name = "depot")
public class Depot {

    @Id
    @Column(name = "libelle_depot")
    private String mLibelleDepot;
    @Column(name = "nom_depot")
    private String mNomDepot;
    @Column(name = "adresse_depot")
    private String mAdresseDepot;
    @Transient
    private List<Affectation> mListAffectation;


    public Depot() {}

    public Depot(String mLibelleDepot, String mNomDepot, String mAdresseDepot) {
        this.mLibelleDepot = mLibelleDepot;
        this.mNomDepot = mNomDepot;
        this.mAdresseDepot = mAdresseDepot;
    }

    public String getmLibelleDepot() {
        return mLibelleDepot;
    }

    public void setmLibelleDepot(String mLibelleDepot) {
        this.mLibelleDepot = mLibelleDepot;
    }

    public String getmNomDepot() {
        return mNomDepot;
    }

    public void setmNomDepot(String mNomDepot) {
        this.mNomDepot = mNomDepot;
    }

    public String getmAdresseDepot() {
        return mAdresseDepot;
    }

    public void setmAdresseDepot(String mAdresseDepot) {
        this.mAdresseDepot = mAdresseDepot;
    }

    public List<Affectation> getmListAffectation() {
        return mListAffectation;
    }

    public void setmListAffectation(List<Affectation> mListAffectation) {
        this.mListAffectation = mListAffectation;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "mLibelleDepot='" + mLibelleDepot + '\'' +
                ", mNomDepot='" + mNomDepot + '\'' +
                ", mAdresseDepot='" + mAdresseDepot + '\'' +
                '}';
    }
}

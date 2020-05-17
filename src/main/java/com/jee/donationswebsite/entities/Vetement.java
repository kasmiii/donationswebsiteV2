package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "vetement")
@Table(name = "vetement")
public class Vetement extends Objet {

    @Column(name = "taille")
    private String mTaille;
    @Column(name = "categorie")
    private String mCategorie;

    public Vetement(String mTaille, String mCategorie) {
        this.mTaille = mTaille;
        this.mCategorie = mCategorie;
    }

    public Vetement(String mIdObjet, String mDescription, String mTaille, String mCategorie) {
        super(mIdObjet, mDescription);
        this.mTaille = mTaille;
        this.mCategorie = mCategorie;
    }

    public String getmTaille() {
        return mTaille;
    }

    public void setmTaille(String mTaille) {
        this.mTaille = mTaille;
    }

    public String getmCategorie() {
        return mCategorie;
    }

    public void setmCategorie(String mCategorie) {
        this.mCategorie = mCategorie;
    }

    @Override
    public String toString() {
        return "Vetement{" +
                "mTaille='" + mTaille + '\'' +
                ", mCategorie='" + mCategorie + '\'' +
                ", mIdObjet='" + mIdObjet + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}

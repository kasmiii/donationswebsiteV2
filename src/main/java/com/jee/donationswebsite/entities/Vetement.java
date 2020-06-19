package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vetement {

    @Id
    @Column(name = "id_objet")
    private String mIdObjet;
    @Column(name = "taille")
    private String mTaille;
    @Column(name = "categorie")
    private String mCategorie;

    public Vetement() {
    }

    public Vetement(String mTaille, String mCategorie) {
        this.mTaille = mTaille;
        this.mCategorie = mCategorie;
    }

    public String getId() {
        return mIdObjet;
    }

    public void setId(String id) {
        this.mIdObjet = id;
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
                //", mDescription='" + mDescription + '\'' +
                '}';
    }
}

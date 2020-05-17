package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "livre")
@Table(name = "livre")
public class Livre extends Objet {

    @Column(name = "titre")
    private String mTitre;
    @Column(name = "nom_auteur")
    private String mNomAuteur;
    @Column(name = "genre")
    private String mGenre;

    public Livre(String mTitre, String mNomAuteur, String mGenre) {
        this.mTitre = mTitre;
        this.mNomAuteur = mNomAuteur;
        this.mGenre = mGenre;
    }

    public Livre(String mIdObjet, String mDescription, String mTitre, String mNomAuteur, String mGenre) {
        super(mIdObjet, mDescription);
        this.mTitre = mTitre;
        this.mNomAuteur = mNomAuteur;
        this.mGenre = mGenre;
    }

    public String getmTitre() {
        return mTitre;
    }

    public void setmTitre(String mTitre) {
        this.mTitre = mTitre;
    }

    public String getmNomAuteur() {
        return mNomAuteur;
    }

    public void setmNomAuteur(String mNomAuteur) {
        this.mNomAuteur = mNomAuteur;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "mTitre='" + mTitre + '\'' +
                ", mNomAuteur='" + mNomAuteur + '\'' +
                ", mGenre='" + mGenre + '\'' +
                ", mIdObjet='" + mIdObjet + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}

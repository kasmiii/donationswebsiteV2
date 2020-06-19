package com.jee.donationswebsite.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livre {

    @Id
    @Column(name = "id_objet")
    private String mIdObjet;
    @Column(name = "titre")
    private String mTitre;
    @Column(name = "nom_auteur")
    private String mNomAuteur;
    @Column(name = "genre")
    private String mGenre;

    public Livre() {
    }

    public Livre(String id, String mTitre, String mNomAuteur, String mGenre) {
        this.mIdObjet=id;
        this.mTitre = mTitre;
        this.mNomAuteur = mNomAuteur;
        this.mGenre = mGenre;
    }

    public String getId() {
        return mIdObjet;
    }

    public void setId(String id) {
        this.mIdObjet = id;
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
                '}';
    }
}

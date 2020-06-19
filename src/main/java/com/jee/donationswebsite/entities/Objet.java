package com.jee.donationswebsite.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Objet {

    @Id
    @Column(name = "id_objet")
    private String mIdObjet;
    @Column(name = "description")
    private String mDescription;

    @Column(name = "type_objet")
    private String mTypeObjet;

    public Objet() {
    }

    public Objet(String mIdObjet, String mDescription,String mTypeObjet) {
        this.mIdObjet = mIdObjet;
        this.mDescription = mDescription;
        this.mTypeObjet=mTypeObjet;
    }

    public String getmIdObjet() {
        return mIdObjet;
    }

    public void setmIdObjet(String mIdObjet) {
        this.mIdObjet = mIdObjet;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmTypeObjet() {
        return mTypeObjet;
    }

    public void setmTypeObjet(String mTypeObjet) {
        this.mTypeObjet = mTypeObjet;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "mIdObjet='" + mIdObjet + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mTypeObjet='" + mTypeObjet + '\'' +
                '}';
    }
}

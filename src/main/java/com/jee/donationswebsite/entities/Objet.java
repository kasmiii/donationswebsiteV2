package com.jee.donationswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Objet {

    @Id
    @Column(name = "id_objet")
    protected String mIdObjet;
    @Column(name = "description")
    protected String mDescription;

    public Objet() {
    }

    public Objet(String mIdObjet, String mDescription) {
        this.mIdObjet = mIdObjet;
        this.mDescription = mDescription;
    }



}

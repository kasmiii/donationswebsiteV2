package com.jee.donationswebsite.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "demandeur")
@Table(name = "demandeur")
@DiscriminatorValue("demandeur")
public class Demandeur extends Personne{

    public Demandeur() {
    }

    public Demandeur(String mCin, String mNom, String mPrenom, String mAdresse, String mTelephone, String mUsername, String mPassword) {
        super(mCin, mNom, mPrenom, mAdresse, mTelephone, mUsername, mPassword);
    }
}

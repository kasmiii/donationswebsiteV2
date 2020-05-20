package com.jee.donationswebsite.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "donateur")
@Table(name = "donateur")
@DiscriminatorValue("donateur")
public class Donateur extends Personne {

    public Donateur() {
    }

    public Donateur(String mCin, String mNom, String mPrenom, String mAdresse, String mTelephone, String mUsername, String mPassword, String mImage) {
        super(mCin, mNom, mPrenom, mAdresse, mTelephone, mUsername, mPassword, mImage);
    }
}

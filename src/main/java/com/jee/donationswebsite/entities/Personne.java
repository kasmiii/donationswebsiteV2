package com.jee.donationswebsite.entities;

import javax.persistence.*;

@Entity
public class Personne {

    @Id
    @Column(name = "cin")
    protected String mCin;
    @Column(name = "nom")
    protected String mNom;
    @Column(name = "prenom")
    protected String mPrenom;
    @Column(name = "adresse")
    protected String mAdresse;
    @Column(name = "telephone")
    protected String mTelephone;
    @Column(name = "username")
    protected String mUsername;
    @Column(name = "password")
    protected String mPassword;
    @Column(name = "image")
    protected String mImage;

    @Column(name = "type")
    protected String mType;
    @Transient
    protected Association mAssociation;

    public Personne() {
    }

    public Personne(String mCin, String mNom, String mPrenom, String mAdresse, String mTelephone, String mUsername, String mPassword,String mImage,String mType) {
        this.mCin = mCin;
        this.mNom = mNom;
        this.mPrenom = mPrenom;
        this.mAdresse = mAdresse;
        this.mTelephone = mTelephone;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mImage=mImage;
        this.mType = mType;
    }

    public String getmCin() {
        return mCin;
    }

    public void setmCin(String mCin) {
        this.mCin = mCin;
    }

    public String getmNom() {
        return mNom;
    }

    public void setmNom(String mNom) {
        this.mNom = mNom;
    }

    public String getmPrenom() {
        return mPrenom;
    }

    public void setmPrenom(String mPrenom) {
        this.mPrenom = mPrenom;
    }

    public String getmAdresse() {
        return mAdresse;
    }

    public void setmAdresse(String mAdresse) {
        this.mAdresse = mAdresse;
    }

    public String getmTelephone() {
        return mTelephone;
    }

    public void setmTelephone(String mTelephone) {
        this.mTelephone = mTelephone;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    @Override
    public String toString() {
        return "Personne{" +
                " mCin='" + mCin + '\'' +
                ", mNom='" + mNom + '\'' +
                ", mPrenom='" + mPrenom + '\'' +
                ", mAdresse='" + mAdresse + '\'' +
                ", mTelephone='" + mTelephone + '\'' +
                ", mUsername='" + mUsername + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mImage='" + mImage + '\'' +
                //mAssociation.toString()+
                '}';
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public Association getmAssociation() {
        return mAssociation;
    }

    public void setmAssociation(Association mAssociation) {
        this.mAssociation = mAssociation;
    }
}

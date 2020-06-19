package com.jee.donationswebsite.model;

public class ObjetProjection {

    private final String mIdObjet;
    private final String mDescription;
    //private String mDateDemande;

    public ObjetProjection(String mIdObjet, String mDescription) {
        this.mIdObjet = mIdObjet;
        this.mDescription = mDescription;
        //this.mDateDemande = mDateDemande;
    }

    public String getmIdObjet() {
        return mIdObjet;
    }

    /*public void setmIdObjet(String mIdObjet) {
        this.mIdObjet = mIdObjet;
    }*/

    public String getmDescription() {
        return mDescription;
    }

    /*public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }*/

    public boolean equals(ObjetProjection o){
        if(this.mIdObjet.equals(o.getmIdObjet())&&this.mDescription.equals(o.getmDescription())){
            return true;
        }
        return false;
    }

    /*public String getmDateDemande() {
        return mDateDemande;
    }

    public void setmDateDemande(String mDateDemande) {
        this.mDateDemande = mDateDemande;
    }*/

}

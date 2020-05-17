package com.jee.donationswebsite.entities;

import javafx.beans.binding.ObjectExpression;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "machine")
@Table(name = "machine")
public class Machine extends Objet {

    @Column(name = "nom_machine")
    private String mNomMachine;
    @Column(name = "type_machine")
    private String mTypeMachine;


    public Machine(String mNomMachine, String mTypeMachine) {
        this.mNomMachine = mNomMachine;
        this.mTypeMachine = mTypeMachine;
    }

    public Machine(String mIdObjet, String mDescription, String mNomMachine, String mTypeMachine) {
        super(mIdObjet, mDescription);
        this.mNomMachine = mNomMachine;
        this.mTypeMachine = mTypeMachine;
    }

    public String getmNomMachine() {
        return mNomMachine;
    }

    public void setmNomMachine(String mNomMachine) {
        this.mNomMachine = mNomMachine;
    }

    public String getmTypeMachine() {
        return mTypeMachine;
    }

    public void setmTypeMachine(String mTypeMachine) {
        this.mTypeMachine = mTypeMachine;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "mNomMachine='" + mNomMachine + '\'' +
                ", mTypeMachine='" + mTypeMachine + '\'' +
                ", mIdObjet='" + mIdObjet + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}

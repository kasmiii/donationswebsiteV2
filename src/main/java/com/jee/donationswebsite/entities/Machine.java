package com.jee.donationswebsite.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Machine {

    @Column(name = "nom_machine")
    private String mNomMachine;
    @Column(name = "type_machine")
    private String mTypeMachine;
    @Id
    @Column(name = "id_objet")
    private String mIdObjet;

    public Machine() {
    }

    public Machine(String id, String mNomMachine, String mTypeMachine) {
        this.mIdObjet=id;
        this.mNomMachine = mNomMachine;
        this.mTypeMachine = mTypeMachine;
    }

    public String getmIdObjet() {
        return mIdObjet;
    }

    public void setmIdObjet(String mIdObjet) {
        this.mIdObjet = mIdObjet;
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
                '}';
    }
}

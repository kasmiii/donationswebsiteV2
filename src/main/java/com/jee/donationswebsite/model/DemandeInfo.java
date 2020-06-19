package com.jee.donationswebsite.model;

import com.jee.donationswebsite.entities.*;

public class DemandeInfo {

    private String type;
    private Objet objet;
    private Machine machine;
    private Vetement vetement;
    private Livre livre;
    private Demande demande;

    public DemandeInfo() { }

    public DemandeInfo(String type, Objet objet, Machine machine, Vetement vetement, Livre livre, Demande demande) {
        this.type = type;
        this.objet = objet;
        this.machine = machine;
        this.vetement = vetement;
        this.livre = livre;
        this.demande = demande;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Objet getObjet() {
        return objet;
    }

    public void setObjet(Objet objet) {
        this.objet = objet;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Vetement getVetement() {
        return vetement;
    }

    public void setVetement(Vetement vetement) {
        this.vetement = vetement;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }
}

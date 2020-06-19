package com.jee.donationswebsite.model;

import com.jee.donationswebsite.entities.*;

public class DetailDemande {

    private Objet objet;
    private Demande demande;
    private Machine machine;
    private Livre livre;
    private Vetement vetement;

    public DetailDemande() {
    }

    public DetailDemande(Objet objet, Demande demande, Machine machine, Livre livre, Vetement vetement) {
        this.objet = objet;
        this.demande = demande;
        this.machine = machine;
        this.livre = livre;
        this.vetement = vetement;
    }

    public Objet getObjet() {
        return objet;
    }

    public void setObjet(Objet objet) {
        this.objet = objet;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Vetement getVetement() {
        return vetement;
    }

    public void setVetement(Vetement vetement) {
        this.vetement = vetement;
    }
}

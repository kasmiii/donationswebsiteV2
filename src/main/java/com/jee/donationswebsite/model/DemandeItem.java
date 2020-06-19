package com.jee.donationswebsite.model;

public class DemandeItem {

    private String idDemande;
    private String dateDemande;
    private String status;
    private String typeDemande;

    public DemandeItem() {
    }

    public DemandeItem(String idDemande, String dateDemande, String status, String typeDemande) {
        this.idDemande = idDemande;
        this.dateDemande = dateDemande;
        this.status = status;
        this.typeDemande = typeDemande;
    }

    public String getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(String idDemande) {
        this.idDemande = idDemande;
    }

    public String getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(String dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
    }

    @Override
    public String toString() {
        return "DemandeItem{" +
                "idDemande='" + idDemande + '\'' +
                ", dateDemande='" + dateDemande + '\'' +
                ", status='" + status + '\'' +
                ", typeDemande='" + typeDemande + '\'' +
                '}';
    }
}

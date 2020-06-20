package com.jee.donationswebsite.repositories;
import com.jee.donationswebsite.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DemandeRepo extends JpaRepository<Demande,String> {

    @Query("select d from Demande d where d.mCinDemandeur=?1")
    List<Demande> getDemandeById(String cin);

    @Query("select d.mIdObjet from Demande d where d.mIdDemande=?1 ")
    String getIdObjet(String id);

    @Modifying
    @Query(value = "delete from Demande d where d.mIdDemande=?1")
    void deleteDemande(String id);

    @Query(value = "select d from Demande d where d.mIdDemande=?1")
    Demande getOneDemandeById(String id_demande);

    @Query(value = "select d from Demande d where d.mIdObjet=?1")
    Demande getDemandeByIdObjet(String id);

}

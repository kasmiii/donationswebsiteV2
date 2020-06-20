package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Objet;
import com.jee.donationswebsite.model.ObjetInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObjetRepo extends JpaRepository<Objet,String> {

    @Query("select o from Objet o where o.mIdObjet=?1 ")
    Objet getObjetById(String id);

    @Query("select o from Objet o,Demande d where d.mIdObjet=o.mIdObjet and d.mStatus='pas encore accepte' ")
    List<Objet> getAllObjets();

    @Query(value = "select  o.mIdObjet,o.mDescription from Objet o where o.mIdObjet=?1 ")
    List<ObjetInterface> findObjetBy(String id);

    @Query(value = "select o.mTypeObjet from Objet o where o.mIdObjet=?1 ")
    String getTypeObjet(String idObjet);

    @Modifying
    @Query(value = "delete from Objet o where o.mIdObjet=?1 ")
    void deleteObjetById(String id);

    @Query(value = "select o from Objet  o,Demande d where o.mDescription like %?1% and o.mIdObjet=d.mIdObjet and d.mStatus='pas encore accepte' ")
    List<Objet> getLobjetsByKeyword(String keyword);
}

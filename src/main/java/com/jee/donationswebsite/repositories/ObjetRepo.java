package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Objet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ObjetRepo extends JpaRepository<Objet,String> {

    @Query("select o from Objet o where o.mIdObjet=?1 ")
    Objet getObjetById(String id);
}

package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Vetement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface VetementRepo extends JpaRepository<Vetement,String> {


    @Query(value = "select v from Vetement v where v.id=?1")
    Vetement getVetementById(String id);

    @Modifying
    @Query(value = "delete from Vetement m where m.id=?1")
    void deleteLivreById(String id);
}

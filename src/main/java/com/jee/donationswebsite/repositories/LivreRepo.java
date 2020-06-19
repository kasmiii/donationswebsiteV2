package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LivreRepo extends JpaRepository<Livre,String> {


    @Query(value = "select m from Livre m where m.id=?1")
    Livre getLivreById(String id);

    @Modifying
    @Query(value = "delete from Livre l where l.id=?1")
    void deleteLivreById(String id);

}

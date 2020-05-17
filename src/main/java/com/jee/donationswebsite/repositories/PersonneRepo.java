package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Personne;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonneRepo extends JpaRepository<Personne,Integer> {

    @Query(value = "select p from Personne p where p.mCin=?1 ")
    Personne getPersonneByCin(String id);

    @Override
    <S extends Personne> S save(S s);

    @Query(value = "select p from Personne p")
    List<Personne> getAllPersons();
}

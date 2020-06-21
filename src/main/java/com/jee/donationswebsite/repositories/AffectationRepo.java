package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Affectation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AffectationRepo extends JpaRepository<Affectation,String> {

    @Query(value = "select a from Affectation a where a.mCinDonateur=?1")
    List<Affectation> getListAffectationbyCin(String cin);


}

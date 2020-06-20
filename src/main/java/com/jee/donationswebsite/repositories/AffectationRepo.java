package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Affectation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AffectationRepo extends JpaRepository<Affectation,String> {

    //@Query(value = "")


}

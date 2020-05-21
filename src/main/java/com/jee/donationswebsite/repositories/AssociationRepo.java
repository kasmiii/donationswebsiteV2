package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssociationRepo extends JpaRepository<Association,String> {

    @Query("select a from Association a where a.mNomAssociation=:name")
    Association getAssociationByName(@Param("name") String name);

    @Query("select a from Association a")
    List<Association> getAll();

    @Query("select a from Association a where a.mCinPersonne=?1 ")
    Association getAssociationByCin(String mCin);

}

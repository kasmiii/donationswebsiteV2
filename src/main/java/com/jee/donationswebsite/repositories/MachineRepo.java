package com.jee.donationswebsite.repositories;

import com.jee.donationswebsite.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MachineRepo extends JpaRepository<Machine,String> {

    @Query(value = "select m from Machine m where m.mIdObjet=?1")
    Machine getMachineById(String id);

    @Modifying
    @Query(value = "delete from Machine m where m.mIdObjet=?1")
    void deleteMachineById(String id);
}

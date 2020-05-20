package com.jee.donationswebsite.controllers;

import com.jee.donationswebsite.entities.Demande;
import com.jee.donationswebsite.entities.Demandeur;
import com.jee.donationswebsite.entities.Personne;
import com.jee.donationswebsite.repositories.ObjetRepo;
import com.jee.donationswebsite.repositories.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;

@RestController
public class PersonneController {

    @Autowired
    private PersonneRepo personneRepo;

    @Autowired
    private ObjetRepo objetRepo;
    @PersistenceContext
    private EntityManager entityManager;


    @GetMapping(path = "/personne/{id}")
    @ResponseBody
    public Personne getOne(@PathVariable("id")String id){
        return personneRepo.getPersonneByCin(id);
        //objetRepo.getObjetById(id);
    }

    @GetMapping(path = "/persons")
    @ResponseBody
    public List<Personne> getPersons(){
        return personneRepo.getAllPersons();
    }

    @GetMapping(path = "/save")
    @ResponseBody
    @Transactional //very important it's a milestone to save data with JPA
    public Demandeur savePerson(){
        Demandeur pers=new Demandeur("vbbvb","dgg","uuuu","uuuu","ttrtt","user","pass","dgdgdgdg");
        this.entityManager.persist(pers);
        return pers;
    }
}

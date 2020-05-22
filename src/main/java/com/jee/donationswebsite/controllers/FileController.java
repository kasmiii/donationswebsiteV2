package com.jee.donationswebsite.controllers;

import com.jee.donationswebsite.entities.Association;
import com.jee.donationswebsite.entities.Personne;
import com.jee.donationswebsite.interfaces.FilesStorageService;
import com.jee.donationswebsite.message.ResponseMessage;
import com.jee.donationswebsite.model.Login;
import com.jee.donationswebsite.repositories.AssociationRepo;
import com.jee.donationswebsite.repositories.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

@RestController
@CrossOrigin(origins = "*")
public class FileController {

    @Autowired
    FilesStorageService storageService;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PersonneRepo personneRepo;

    @Autowired
    AssociationRepo associationRepo;

    @PostMapping(path = "/uploadimage")//,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {//, @RequestParam("personne")Personne personne
        String message = "";
        try {
            storageService.save(file);
            //System.out.println("the person recovered is:\n"+personne);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @PostMapping(path = "/signup")
    @Transactional
    public Personne savePersonne(@RequestBody Personne personne){
        //System.out.println("le personne recupere est: "+personne);
        Association association=personne.getmAssociation();
        //System.out.println(association.toString());
        //System.out.println(personne.toString());
        this.entityManager.persist(personne);

        if(association!=null){
            this.entityManager.persist(association);
        }
        else{}
        return personne;
    }

    @PostMapping(path = "/signin")
    @Transactional
    Personne signin(@RequestBody Login login){
        System.out.println("le login envoye est\t\t\t\t"+login);
        Personne personne=personneRepo.getPersonneByUsernamdAAndMPassword(login.getUsername(),login.getPassword());
        if(personne!=null){
            Association association=associationRepo.getAssociationByCin(personne.getmCin());
            if(association!=null){
                //HttpSession session=();
                personne.setmAssociation(association);
            }
        }
        return personne;
    }

}

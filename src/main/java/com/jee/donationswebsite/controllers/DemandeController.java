package com.jee.donationswebsite.controllers;

import com.jee.donationswebsite.entities.*;
import com.jee.donationswebsite.model.DemandeInfo;
import com.jee.donationswebsite.model.DemandeItem;
import com.jee.donationswebsite.model.ObjetInterface;
import com.jee.donationswebsite.model.ObjetProjection;
import com.jee.donationswebsite.repositories.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class DemandeController {

    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    private ObjetRepo objetRepo;
    @Autowired
    private DemandeRepo demandeRepo;

    @Autowired
    private MachineRepo machineRepo;
    @Autowired
    private VetementRepo vetementRepo;
    @Autowired
    private LivreRepo livreRepo;



    @PostMapping(path = "/saveDemande")
    @ResponseBody
    @Transactional
    public DemandeInfo saveDamande(@RequestBody DemandeInfo demandeInfo){
        //System.out.println(demandeInfo);
        String typeObjet=demandeInfo.getType();
        Objet objet=demandeInfo.getObjet();
        Demande demande=demandeInfo.getDemande();
        entityManager.persist(objet);
        entityManager.persist(demande);
        switch(typeObjet){
            case "livre":
                Livre livre=demandeInfo.getLivre();
                entityManager.persist(livre);
                break;
            case "machine":
                Machine machine=demandeInfo.getMachine();
                System.out.println("id de la machine recu est:"+machine);
                entityManager.persist(machine);
                break;
            case "vetement":
                Vetement vetement=demandeInfo.getVetement();
                entityManager.persist(vetement);
                break;
                default:
                    System.out.println("aucun objet n'est recu !");
                    break;
        }
        return demandeInfo;
    }

    @GetMapping(path = "/getObjet/{id_objet}")
    @ResponseBody
    public List<ObjetInterface> getObjetById(@PathVariable("id_objet") String id){

        System.out.println("le objet recherche est:"+id);
        //System.out.println("l'objet trouve est :"+objetRepo.getObjet(id).getmIdObjet()+" descroiption "+objetRepo.getObjet(id).getmDescription());
        List<ObjetInterface> list=objetRepo.findObjetBy(id);
        for (ObjetInterface es : list) {
            System.out.printf("id objet: %s, description: %s", es.getmIdObjet(), es.getmDescription());
        }
        return objetRepo.findObjetBy(id);
    }

    @GetMapping(path = "/mesDemandes")
    @ResponseBody
    ArrayList<DemandeItem> getListDemands(@RequestParam("cin")String cin){

        //System.out.println("le cin du demandeur est: "+cin);
        ArrayList<DemandeItem> list_demandes_items=new ArrayList<DemandeItem>();

        List<Demande> list=demandeRepo.getDemandeById(cin);

        //System.out.println("la liste des demandes est:\n");

        /*for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

        for (int i=0;i<list.size();i++){
            DemandeItem demandeItem=new DemandeItem(
                    list.get(i).getmIdDemande(),list.get(i).getmDateDemande(),
                    list.get(i).getmStatus(),null
            );
            String type_demande=objetRepo.getTypeObjet(list.get(i).getmIdObjet());
            demandeItem.setTypeDemande(type_demande);
            list_demandes_items.add(demandeItem);
        }
        return list_demandes_items;
    }

    @GetMapping(path = "/deleteDemande")
    @ResponseBody
    @Transactional
    public Demande deleteDemande(@RequestParam("id") String id_demande,@RequestParam("type")String type){

        System.out.println("id demande recu est"+id_demande+"type:"+type);
        String id_objet=demandeRepo.getIdObjet(id_demande);
        //String type_objet=objetRepo.getTypeObjet(id_objet);
        Demande demande=demandeRepo.getOne(id_demande);
        demandeRepo.deleteDemande(id_demande);
        switch (type){
            case "machine":
                machineRepo.deleteMachineById(id_objet);
                break;
            case "vetement":
                vetementRepo.deleteLivreById(id_objet);

                break;
            case "livre":
                livreRepo.deleteLivreById(id_objet);
                break;
            default:
                System.out.println("aucun type trouve...");break;
        }

        objetRepo.deleteObjetById(id_objet);

        return demande;
    }

    @GetMapping(path = "/detailDemande")
    @ResponseBody
    @Transactional
    public DemandeInfo getDemandeInfo(@RequestParam("id")String id,@RequestParam("type") String type){

        DemandeInfo demandeInfo=new DemandeInfo();
        demandeInfo.setType(type);
        Demande demande=demandeRepo.getOneDemandeById(id);
        Objet objet=objetRepo.getObjetById(demande.getmIdObjet());
        demandeInfo.setDemande(demande);
        demandeInfo.setObjet(objet);
        switch(type){
            case "machine":
                Machine machine=machineRepo.getMachineById(objet.getmIdObjet());
                demandeInfo.setMachine(machine);
                break;
            case "vetement":
                Vetement vetement=vetementRepo.getVetementById(objet.getmIdObjet());
                demandeInfo.setVetement(vetement);
                break;
            case "livre":
                Livre livre=livreRepo.getLivreById(objet.getmIdObjet());
                demandeInfo.setLivre(livre);
                break;
            default:
                System.out.println("aucun type trouve...");break;
        }
        return demandeInfo;
    }
}
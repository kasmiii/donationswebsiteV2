package com.jee.donationswebsite.controllers;

import com.jee.donationswebsite.entities.*;
import com.jee.donationswebsite.model.DemandeInfo;
import com.jee.donationswebsite.model.DemandeItem;
import com.jee.donationswebsite.model.Donation;
import com.jee.donationswebsite.model.ObjetInterface;
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
    @Autowired
    private PersonneRepo personneRepo;
    @Autowired
    private AffectationRepo affectationRepo;
    @Autowired
    AssociationRepo associationRepo;


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
                System.out.println("id du  livre recu est:"+livre);
                entityManager.persist(livre);
                break;
            case "machine":
                Machine machine=demandeInfo.getMachine();
                System.out.println("id de la machine recu est:"+machine);
                entityManager.persist(machine);
                break;
            case "vetement":
                Vetement vetement=demandeInfo.getVetement();
                System.out.println("id du vetement recu est:"+vetement);
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
        demandeInfo.setPersonne(null);
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

    @GetMapping(path = "/searchDemandes")
    @ResponseBody
    public ArrayList<DemandeInfo> getDemandesByKeyword(@RequestParam("keyword")String keyword){

        List<Objet> list_objets;

        if(keyword.equals("ALL")){
            list_objets=objetRepo.getAllObjets();
        }
        else list_objets=objetRepo.getLobjetsByKeyword(keyword);

         ArrayList<DemandeInfo> list=new ArrayList<>();
         for(int i=0;i<list_objets.size();i++){
             DemandeInfo demandeInfo=new DemandeInfo();
             demandeInfo.setObjet(list_objets.get(i));//set
             Demande demande=demandeRepo.getDemandeByIdObjet(list_objets.get(i).getmIdObjet());
             demandeInfo.setDemande(demande);//set
             Personne personne=personneRepo.getPersonneByCin(demande.getmCinDemandeur());
             demandeInfo.setPersonne(personne);//set
             demandeInfo.setType(list_objets.get(i).getmTypeObjet());//set

             switch (list_objets.get(i).getmTypeObjet()){
                 case "vetement":
                     Vetement vetement=vetementRepo.getVetementById(list_objets.get(i).getmIdObjet());
                     demandeInfo.setVetement(vetement);//set
                     break;
                 case "machine":
                     Machine machine=machineRepo.getMachineById(list_objets.get(i).getmIdObjet());
                     demandeInfo.setMachine(machine);//set
                     break;
                 case "livre":
                     Livre livre=livreRepo.getLivreById(list_objets.get(i).getmIdObjet());
                     demandeInfo.setLivre(livre);//set
                     break;
                 default:
                     System.out.println("no type found");
                     break;
             }
             list.add(demandeInfo);
         }
         return list;
    }


    @PostMapping(path = "/saveDonation")
    @ResponseBody
    @Transactional
    public Affectation saveAffectation(@RequestBody Affectation affectation){
        //System.out.println(" l'affectation envoyee est:"+affectation);
        this.entityManager.persist(affectation);
        this.demandeRepo.updateDemande(affectation.getmIdObjet(),"accepte");
        return affectation;
    }

    @GetMapping(path = "/mesDonations")
    @ResponseBody
    public ArrayList<Donation> getDonations(@RequestParam("cin")String cin){
        List<Affectation> list_affectation=affectationRepo.getListAffectationbyCin(cin);
        ArrayList<Donation> list_donations=new ArrayList<Donation>();

        for (int i=0;i<list_affectation.size();i++){
            Donation donation=new Donation();
            donation.setAffectation(list_affectation.get(i));//set Affectation
            Objet objet=objetRepo.getObjetById(list_affectation.get(i).getmIdObjet());
            donation.setObjet(objet);//set Objet
            Personne personne=personneRepo.getPersonneByCin(list_affectation.get(i).getmCinDemandeur());
            donation.setPersonne(personne);//set Personne
            Association association=associationRepo.getAssociationByCin(list_affectation.get(i).getmCinDemandeur());
            donation.setAssociation(association);//set Association
            list_donations.add(donation);
        }
        return list_donations;

    }

}

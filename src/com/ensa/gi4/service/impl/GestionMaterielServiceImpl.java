package com.ensa.gi4.service.impl;

import com.ensa.gi4.datatabase.MaterielDAO;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.ArrayList;
import java.util.List;

public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here

    private MaterielDAO materielDAO = new MaterielDAO();

    public GestionMaterielServiceImpl(MaterielDAO materielDAO) {
        this.materielDAO = materielDAO;
    }

    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        for (int i = 0; i < materielDAO.getListe().size(); i++) {
            if(materielDAO.getListe().get(i).getClass().toString().equals("class com.ensa.gi4.modele.Chaise")){
                System.out.println("Chaise:"+ materielDAO.getListe().get(i).getName());
            }
            else{
                System.out.println("Livre:"+ materielDAO.getListe().get(i).getName());
            }
        }


    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        List<Materiel> l1 = materielDAO.getListe();
        l1.add(materiel);
        materielDAO.setListe(l1);
    }
    @Override
    public void supprimerMateriel(String materiel){
        List<Materiel> l1 = materielDAO.getListe();
        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i).getName().equals(materiel)){
                l1.remove(l1.get(i));
                System.out.println("Removed succesfully!");
            }
        }
    }
    @Override
    public void rechercherMateriel(String materiel){
        List<Materiel> l1 = materielDAO.getListe();
        boolean imane = false;

        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i).getName().equals(materiel)){
                imane = true;
            }

        }
        if(imane){
            System.out.println(materiel+" existe");
        }
        else{
            System.out.println(materiel+" n'existe pas");
        }
    }
    public void modifierMateriel(String materiel,String newMateriel){
        List<Materiel> l1 = materielDAO.getListe();

        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i).getName().equals(materiel)){
                l1.get(i).setName(newMateriel);
            }
        }
        System.out.println("Nom du materiel modifie!");
    }
}

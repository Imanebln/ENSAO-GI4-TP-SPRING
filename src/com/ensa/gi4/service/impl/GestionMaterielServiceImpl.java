package com.ensa.gi4.service.impl;

import com.ensa.gi4.datatabase.MaterielDAO;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GestionMaterielServiceImpl implements GestionMaterielService {

    // bd goes here
    private MaterielDAO materiel;

    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public List<Materiel> getAllMateriels() {
        return materiel.getAllMateriels();
    }

    @Override
    public void addMateriel(Materiel materiel) {
        this.materiel.addMateriel(materiel);
    }

    @Override
    public void deleteMateriel(String nom) {
        this.materiel.deleteMateriel(nom);
    }

    @Override
    public Materiel getMateriel(String nom) {
        return materiel.getMateriel(nom);
    }

    @Override
    public void updateMateriel(String nom, Materiel materiel) {
        this.materiel.updateMateriel(nom,materiel);
    }

    @Autowired
    public void setMaterielDao(MaterielDAO materiel) {
        // injection par accesseur
        this.materiel = materiel;
    }
}
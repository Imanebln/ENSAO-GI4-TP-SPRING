package com.ensa.gi4.service.impl;

import com.ensa.gi4.datatabase.MaterielDAO;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.AllocationMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllocationMaterielServiceImpl implements AllocationMaterielService {

    private MaterielDAO materiel;

    @Override
    public void allouerMateriel(String nom, int nbreJrs) {
        this.materiel.addToMaterielAlloue(nom);
        this.materiel.deleteMateriel(nom);
        String data = "Materiel Alloué pour " + nbreJrs + " Jours";
        System.out.println(data);
    }

    @Override
    public void rendreMateriel(String nom) {
        Materiel m =  this.materiel.getFromMaterielAlloue(nom);
        this.materiel.removeFromMaterielAlloue(nom);
        this.materiel.addMateriel(m);
    }

    @Override
    public List<Materiel> listerMateriel() {
        return materiel.getMaterielsAlloue();
    }

    @Autowired
    public void setMaterielDao(MaterielDAO materiel) {
        // injection par accesseur
        this.materiel = materiel;
    }
}
package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AllocationMaterielService {
    void allouerMateriel(String nom, int nbreJrs);
    void rendreMateriel(String nom);
    List<Materiel> listerMateriel();

}
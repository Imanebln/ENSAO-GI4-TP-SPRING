package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.List;

public interface GestionMaterielService {
    void init();

    List<Materiel> getAllMateriels();
    void addMateriel(Materiel materiel);
    void deleteMateriel(String nom);
    Materiel getMateriel(String nom);
    void updateMateriel(String nom, Materiel materiel);
}
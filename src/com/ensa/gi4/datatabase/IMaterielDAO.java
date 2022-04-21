package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IMaterielDAO {
    List<Materiel> getAllMateriels();
    void addMateriel(Materiel materiel);
    void deleteMateriel(String nom);
    Materiel getMateriel(String nom);
    void updateMateriel(String nom, Materiel materiel);
    List<Materiel> getMaterielsAlloue();
    Materiel getFromMaterielAlloue(String nom);
    void removeFromMaterielAlloue(String nom);
    void addToMaterielAlloue(String nom);
}
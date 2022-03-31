package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;

public interface GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void supprimerMateriel(String materiel);
    void rechercherMateriel(String materiel);
    void modifierMateriel(String materiel,String newMateriel);
}

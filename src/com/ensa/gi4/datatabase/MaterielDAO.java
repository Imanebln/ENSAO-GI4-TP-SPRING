package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;

import java.util.ArrayList;
import java.util.List;

public class MaterielDAO {

    private List<Materiel> liste = new ArrayList<>();
    public MaterielDAO()
    {
        Chaise chaise= new Chaise();
        Livre livre = new Livre();

        chaise.setName("Chair");
        livre.setName("Book");

        liste.add(chaise);
        liste.add(livre);

    }

    public List<Materiel> getListe() {
        return liste;
    }

    public void setListe(List<Materiel> liste) {
        this.liste = liste;
    }
}

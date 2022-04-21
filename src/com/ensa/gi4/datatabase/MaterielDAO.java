package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterielDAO implements IMaterielDAO {

    private static MaterielDAO singleton = new MaterielDAO();

    public static MaterielDAO getInstance(){
        return singleton;
    }

    List<Materiel> materiels;
    List<Materiel> materielsAlloue;

    public MaterielDAO() {
        this.materiels = new ArrayList<>();
        this.materielsAlloue = new ArrayList<>();
        Livre livre1 = new Livre();
        livre1.setName("zelda");
        Chaise chaise1 = new Chaise();
        chaise1.setName("tabouret");

        materiels.add(livre1);
        materiels.add(chaise1);
    }

    @Override
    public void addToMaterielAlloue(String nom)
    {
        Materiel materielToAdd = null;
        for (Materiel materiel:
                materiels) {
            if (materiel.getName().equals(nom))
            {
                System.out.println("the content of our materiel.getName() is : "+materiel.getName());
                materielToAdd = materiel;
                break;
            }
        }
        this.materielsAlloue.add(materielToAdd);
    }
    @Override
    public void removeFromMaterielAlloue(String nom)
    {
        Materiel materielToDelete = null;
        for (Materiel materiel:
                materielsAlloue) {
            if (materiel.getName().equals(nom))
            {
                materielToDelete = materiel;
                break;
            }


        }
        this.materielsAlloue.remove(materielToDelete);
    }
    @Override
    public Materiel getFromMaterielAlloue(String nom)
    {
        Materiel materielToGet = null;
        for (Materiel materiel:
                materielsAlloue) {
            if (materiel.getName().equals(nom))
            {
                materielToGet = materiel;
                break;
            }


        }
        return materielToGet;
    }
    @Override
    public List<Materiel> getMaterielsAlloue()
    {
        return this.materielsAlloue;
    }

    @Override
    public List<Materiel> getAllMateriels() {
        return this.materiels;
    }

    @Override
    public void addMateriel(Materiel materiel) {
        this.materiels.add(materiel);
    }

    @Override
    public void deleteMateriel(String nom) {

        Materiel materielToDelete = null;
        for (Materiel materiel:
                materiels) {
            if (materiel.getName().equals(nom))
            {
                materielToDelete = materiel;
                break;
            }


        }

        this.materiels.remove(materielToDelete);

    }

    @Override
    public Materiel getMateriel(String nom) {
        Materiel materielToGet = null;
        for (Materiel materiel:
                materiels) {
            if (materiel.getName().equals(nom))
            {
                materielToGet = materiel;
                break;
            }

        }
        return materielToGet;
    }

    @Override
    public void updateMateriel(String nom, Materiel materiel) {
        Materiel materielToUpdate = null;
        for (Materiel m:
                materiels) {
            if (m.getName().equals(nom))
            {
                materielToUpdate = m;
                break;
            }

        }
        materielToUpdate.setName(materiel.getName());
    }
}
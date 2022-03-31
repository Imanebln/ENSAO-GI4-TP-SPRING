package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {

    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }
    public void ajouterNouveauMateriel(Materiel materiel){gestionMaterielService.ajouterNouveauMateriel(materiel);}
    public void supprimerMateriel(String materiel){gestionMaterielService.supprimerMateriel(materiel);}
    public void rechercherMateriel(String materiel){gestionMaterielService.rechercherMateriel(materiel);}
    public void modifierMateriel(String materiel,String newMateriel){gestionMaterielService.modifierMateriel(materiel,newMateriel);}

    public void afficherMenu() {
        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("3- pour supprimer un materiel, entrer 3");
        System.out.println("4- pour rechercher un materiel, entrer 4");
        System.out.println("5- pour modifier un materiel, entrer 5");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
            System.out.println("Choisir 1 pour Livre et 2 pour Chaise: ");
            Scanner s = new Scanner(System.in);
            String n = s.next();
            switch (n){
                case "1":
                    Livre l = new Livre();
                    System.out.println("Enter le nom de votre livre:");
                    Scanner s1 = new Scanner(System.in);
                    String n1 = s1.next();
                    l.setName(n1);
                    ajouterNouveauMateriel(l);
                    System.out.println("Votre livre est ajoute!");
                    break;

                case "2":
                    Chaise c = new Chaise();
                    System.out.println("Enter le nom de votre chaise:");
                    Scanner s2 = new Scanner(System.in);
                    String n2 = s2.next();
                    c.setName(n2);
                    ajouterNouveauMateriel(c);
                    System.out.println("Votre chaise est ajoute!");
                    break;
            }
            }else if("3".equals(next)){
            System.out.println("Choisir 1 pour supprimer Livre et 2 pour supprimer Chaise: ");
            Scanner s = new Scanner(System.in);
            String n = s.next();
            switch (n){
                case "1":
                    System.out.println("Enter le nom de votre livre:");
                    Scanner s1 = new Scanner(System.in);
                    String n1 = s1.next();
                    supprimerMateriel(n1);
                    System.out.println("Votre livre est suprime!");
                    break;

                case "2":
                    System.out.println("Enter le nom de votre chaise:");
                    Scanner s2 = new Scanner(System.in);
                    String n2 = s2.next();
                    supprimerMateriel(n2);

                    break;
            }


        }
        else if("4".equals(next)){
            System.out.println("Entrer le nom de votre materiel: ");
            Scanner s = new Scanner(System.in);
            String n = s.next();
            rechercherMateriel(n);
        }
        else if("5".equals(next)){
            System.out.println("Entrer le nom de votre materiel: ");
            Scanner s = new Scanner(System.in);
            String n = s.next();
            System.out.println("Entrer le nouveau nom de votre materiel: ");
            Scanner sn = new Scanner(System.in);
            String nn = sn.next();
            modifierMateriel(n,nn);
        }
        else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}

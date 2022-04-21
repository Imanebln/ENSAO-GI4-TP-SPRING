# spring-consoleapp-sample

## Introduction

![alt text](https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg)

- Un simple projet utilise [Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/),pour la gestion de matériels

## Install

Effectuez les étapes suivantes :

1. Téléchargez et installez IntelliJ IDEA.
1. Clonez ce répértoire.
1. Selectionner **File > Import** dans le menu bar.
1. Selectionner ce projet dans 'TP01-ENSAO-GI4' and cliquez Finish button.

## Project Map

La figure suivante est la carte de cet exemple de projet.

```
- src/
  + beans                       … Contient les beans de notre projet (DAO + CRUD)
  -com/ensa/gi4/
      + controller              … Définir les contrôleurs.
      + modele                  … Definit les models
      + database                … Fournit un service d'accès à la base de données.
      + service                 … Fournit les services de gestion de materiels.
- src/test/
  + com/ensa/gi4/service/test   … Define unit tests.
```

## Model

- Chaque materiel est identifié par les informations suivantes :

| Materiel                    |
| --------------------------- |
| name : String               |
| getName() : String          |
| setName(String name) : void |

## Gestion de materiels

les services dans la gestion de materiels.

| Nom du service         | Paramètre | Sommaire                                         |
| :--------------------- | :-------- | :----------------------------------------------- |
| listerMateriel         | -         | afficher les materiels qui se trouve dans BDD    |
| ajouterNouveauMateriel | Materiel  | Ajouter un materiel dans BDD                     |
| supprimerMateriel      | -         | supprimer un materiel de la BDD                  |
| modifierMateriel       | -         | modifier le nom d'un materiel de la BDD          |
| chercherMateriel       | -         | chercher sur un materiel s'il existe dans la BDD |
| allouerMateriel        | -         | allouer un materiel qui se trouve dans la BDD    |

## Libraries

This sample uses the following libraries.

| Library Name      | Version |
| :---------------- | :-----: |
| spring-beans      |  4.2.6  |
| spring-context    |  4.2.6  |
| spring-core       |  4.2.6  |
| spring-expression |  4.2.6  |
| commons-logging   |  1.1.1  |

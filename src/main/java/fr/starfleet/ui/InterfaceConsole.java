package starfleet_reservation_system.src.main.java.fr.starfleet.ui;

import java.time.temporal.ValueRange;
import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Civil;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Officier;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Personne;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau.Vaisseau;
import starfleet_reservation_system.src.main.java.fr.starfleet.systeme.SystemeReservation;

public class InterfaceConsole {
    private SystemeReservation systeme;
    private Scanner scanner;

    public InterfaceConsole(){
        this.systeme = new SystemeReservation();
        this.scanner = new Scanner(System.in);
    }

    public void demarrer(){
        boolean continuer = true;
        while(continuer){
            afficherMenu();
            System.out.println("Choississez une option");
            int choix = scanner.nextInt();
            scanner.nextLine();
            switch(choix){
                case 1:
                    gererVaisseaux();
                    break;
                case 2:
                    gererPersonnes();
                    break;
                case 3:
                    gererMissions();
                    break;
                case 4:
                    gererReservations();
                    break;
                case 5:
                    sauvegarderDonnees();
                    break;
                case 6:
                    chargerDonnees();
                    break;
                default: 
                    System.out.println("Choix invalide. Veuillez réessayer !");
            }
        }
    }

    private void afficherMenu(){
        System.out.println("\n----------Menu de gestion de starfleet reservation system----------");
        System.out.println("1. Gérer les vaisseaux");
        System.out.println("2. Gérer les personnes");
        System.out.println("3. Gérer les missions");
        System.out.println("4. Gérer les réservations");
        System.out.println("5. Sauvegarder les données");
        System.out.println("6. Charger les données");
        System.out.println("7. Quittez");
    }

    private void gererVaisseaux(){
        System.out.println("\n-----Gestion des vaisseaux-----");
        System.out.println("1. Afficher tous les vaisseaux");
        System.out.println("2. Ajouter un vaisseau");
        System.out.println("3. Retour au menu de gestion");
        System.out.println("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();
        switch (choix) {
            case 1:
                systeme.afficherVaisseaux(systeme.getVaisseaux());
                break;
            case 2:
                System.out.println("Nom du vaisseau : ");
                String nomVaisseau = scanner.nextLine();
                System.out.println("Immatriculation : ");
                String immatriculation = scanner.nextLine();
                System.out.println("Capacité maximale : ");
                int capacite = scanner.nextInt();
                scanner.nextLine();
                Vaisseau nouveauVaisseau = new Vaisseau(nomVaisseau, immatriculation, capacite, null);
                systeme.ajouterVaisseau(nouveauVaisseau);
                System.out.println("Vaisseau ajouté avec succès"); 
                break;       
            default:
                System.out.println("Choix invalide !");
        }
    }

    private void gererPersonnes(){
        System.out.println("\n-----Gestion des personnes-----");
        System.out.println("1. Afficher toutes les personnes");
        System.out.println("2. Ajouter une personne");
        System.out.println("3. Retour au menu de gestion");
        System.out.println("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();
        switch (choix) {
            case 1:
                systeme.afficherPersonnes(systeme.getPersonnes());
                break;
            case 2:
                System.out.println("Quel type de personne souhaitez-vous ajouter ? : ");
                System.out.println("1. Civil");
                System.out.println("2. Officer");
                System.out.println("Votre choix : ");
                int typePersonne = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nom de la personne : ");
                String nom = scanner.nextLine();
                System.out.println("Prénom de la personne : ");
                String prenom = scanner.nextLine();
                System.out.println("Identifiant de la personne : ");
                String id = scanner.nextLine();
                if(typePersonne==1){
                    Personne civil = new Civil(nom, prenom, id, prenom, id);
                    systeme.ajouterPersonne(civil);
                    System.out.println("Civil ajouté avec succès");
                }else if(typePersonne==2){
                    Personne officier = new Officier(nom, prenom, id, nom, prenom);
                    systeme.ajouterPersonne(officier);
                    System.out.println("Officier ajouté avec succès");
                }else{
                    System.out.println("Choix invalide");
                }
                break;
                default:
                    System.out.println("Choix invalide");
        }
    }

    private void gererMissions(){
        System.out.println("\n-----Gestion des missions-----");
        System.out.println("1. Afficher toutes les missions");
        System.out.println("2. Ajouter une mission");
        System.out.println("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();
    }

    private void gererReservations(){

    }

    private void sauvegarderDonnees(){

    }

    private void chargerDonnees(){
        
    }

}

package fr.starfleet.ui;

import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.personne.*;
import fr.starfleet.modele.vaisseau.Vaisseau;
import fr.starfleet.systeme.SystemeReservation;
import java.io.*;
import java.text.*;
import java.util.*;

public class InterfaceConsole {
    private final SystemeReservation systeme;
    private final Scanner scanner;

    public InterfaceConsole(){
        this.systeme = new SystemeReservation();
        this.scanner = new Scanner(System.in);
    }

    public void demarrer() throws IOException{
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
                    sauvegarderDonnees("sauvegarde.dat");
                    break;
                case 6:
                    chargerDonnees("sauvegarde.dat");
                    break;
                case 7:
                    continuer = false;
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
        switch(choix){
            case 1:
                systeme.afficherMissions(systeme.getMissions());
                break;
            case 2:
                System.out.println("Code de la mission : ");
                String codeMission = scanner.nextLine();
                System.out.println("Description de la mission");
                String descripMission = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date dateDepart = null;
                Date dateRetour = null;
                try{
                    System.out.println("Date de départ de la mission (JJ-MM-AAAA)");
                    String dateDepartStr = scanner.nextLine();
                    dateDepart = sdf.parse(dateDepartStr);
                    System.out.print("Date de retour (JJ-MM-AAAA) : ");
                    String dateRetourStr = scanner.nextLine();
                    dateRetour = sdf.parse(dateRetourStr);
                }catch(ParseException e){
                    System.out.println("Erreur du format de la date : Utilisez le format : JJ-MM-AAAA");
                    return;
                }
                System.out.print("Destination de la mission : ");
                String destination = scanner.nextLine();
                System.out.print("Capacité maximale de la mission : ");
                int capaciteMaximale = scanner.nextInt();
                scanner.nextLine();
                systeme.afficherVaisseaux(systeme.getVaisseaux());
                System.out.print("Choisissez le vaisseau (ID) pour cette mission : ");
                String idVaisseau = scanner.nextLine();
                Vaisseau vaisseauChoisi = systeme.getVaisseauParId(idVaisseau);
                Mission mission = new Mission(codeMission, descripMission, dateDepart, dateRetour, destination, vaisseauChoisi, new ArrayList<>(), capaciteMaximale);
                systeme.creerMission(mission);
                System.out.println("Mission ajoutée !");
                break;
            default:
                System.out.println("Choix invalide");
        }
    }

    private void gererReservations(){
        System.out.println("\n===== Gestion des Réservations =====");
        System.out.println("1. Afficher toutes les réservations");
        System.out.println("2. Créer une réservation");
        System.out.println("0. Retour au menu principal");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine();
        switch (choix) {
            case 1:
                systeme.afficherReservations(systeme.getReservations());
                break;
            case 2:
                System.out.print("ID de la personne : ");
                String idPersonne = scanner.nextLine();
                systeme.effectuerReservation(idPersonne);
                System.out.println("Réservation créée !");
            default:
                break;
        }
    }

    private void sauvegarderDonnees(String fichier) throws IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))){
            oos.writeObject(this);
            System.out.println("Données sauvegardées avec succès !");
        }catch(IOException e){
            System.out.println("Erreur lors de la sauvegarde des données.");
        }
    }

    public static SystemeReservation chargerDonnees(String fichier){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))){
            return (SystemeReservation) ois.readObject();
        }catch(FileNotFoundException e){
            System.out.println("Fichier non trouvé : " + fichier);
    } catch (IOException e) {
        System.out.println("Erreur d'entrée/sortie lors du chargement des données.");
    } catch (ClassNotFoundException e) {
        System.out.println("Classe non trouvée lors de la désérialisation.");
    }
    return null;
    }

}

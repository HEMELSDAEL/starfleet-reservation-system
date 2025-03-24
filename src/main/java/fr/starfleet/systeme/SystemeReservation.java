package starfleet_reservation_system.src.main.java.fr.starfleet.systeme;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Personne;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation.Reservation;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau.Vaisseau;

/**Classe SystemeReservation */
public class SystemeReservation {
    /**Attribut liste de vaisseaux pour le système de réservation */
    private List<Vaisseau> vaisseaux;
    /**Attribut liste de personnes pour le système de réservation */
    private List<Personne> personnes;
    /**Attribut liste de missions pour le système de réservation */
    private List<Mission> missions;
    /**Attribut liste de réservation pour le système de réservation */
    private List<Reservation> reservations;

    /**
     * Constructeur du système de réservation afin de gérer les missions spatiales et les passagers à bord des vaisseaux
     * @param vaisseaux : liste de vaisseaux du système de réservation
     * @param personnes : liste de personnes du système de réservation
     * @param missions : liste de missions du système de réservation
     * @param reservations : liste de réservation du système de réservation
     */
    public SystemeReservation(){
        this.vaisseaux = new ArrayList<>();
        this.personnes = new ArrayList<>();
        this.missions = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    /**
     * Getter qui permet de récupérer la liste des vaisseaux du système de réservation
     * @return : la liste des vaisseaux
     */
    public List<Vaisseau> getVaisseaux(){
        return this.vaisseaux;
    }

    /**
     * Setter qui permet de modifier la liste des vaisseaux
     * @param newVaisseau : nouvelle liste de vaisseaux
     */
    public void setVaiseaux(List<Vaisseau> newVaisseau){
        this.vaisseaux = newVaisseau;
    }

    /**
     * Getter qui permet de récupérer la liste des personnes du système de réservation
     * @return : la liste des personnes
     */
    public List<Personne> getPersonnes(){
        return this.personnes;
    }

    /**
     * Setter qui permet de changer la liste des personnes 
     * @param newPersonne : nouvelle liste de personnes
     */
    public void setPersonne(List<Personne> newPersonne){
        this.personnes = newPersonne;
    }

    /**
     * Getter qui permet de récupérer la liste des missions du système de réservation
     * @return : la liste des missions
     */
    public List<Mission> getMissions(){
        return this.missions;
    }

    /**
     * Setter qui permet de modifier la liste des missions
     * @param newMission : nouvelle liste de mission
     */
    public void setMissions(List<Mission> newMission){
        this.missions = newMission;
    }

    /**
     * Getter qui permet d'obtenir la liste des réservations du système de réservation
     * @return : la liste des réservations
     */
    public List<Reservation> getReservations(){
        return this.reservations;
    }

    /**
     * Setter qui permet de changer la liste des réservations
     * @param newReservation : nouvelle liste de réservation
     */
    public void setReservation(List<Reservation> newReservation){
        this.reservations = newReservation;
    }

    /**
     * Méthode qui va ajouter un vaisseau à la liste des vaisseaux du système de réservation
     * @param vaisseau : vaisseau à ajouter
     */
    public void ajouterVaisseau(Vaisseau vaisseau){
        this.vaisseaux.add(vaisseau);
    }

    /**
     * Méthode qui va ajouter une personne à la liste des personnes du système de réservation
     * @param personne : personne à ajouter
     */
    public void ajouterPersonne(Personne personne){
        this.personnes.add(personne);
    }

    /**
     * Méthode qui va créer une mission à ajotuer à la liste des missions du système de réservation
     * @param mission : mission à ajouter
     */
    public void creerMission(Mission mission){
        this.missions.add(mission);
    }

    /**
     * Méthode qui va effectuer une réservation en fonction de l'id d'une personne
     * @param idPersonne : id de la personne qui effectue la réservation
     * @return : une réservation avec l'id de la personne
     */
    public Reservation effectuerReservation(String idPersonne) {
        Personne personne = null;
        for (Personne p : personnes) {
            if (p.getIdentifiant().equals(idPersonne)) {
                personne = p;
                break;
            }
        }
        if (personne == null) {
            System.out.println("Personne non trouvée.");
            return null;
        }
        Mission missionDisponible = null;
        for (Mission mission : missions) {
            if (mission.getReservations().size() < mission.getNombrePlacesDisponibles()) {
                missionDisponible = mission;
                break;
            }
        }
        if (missionDisponible == null) {
            System.out.println("Aucune mission disponible.");
            return null;
        }

        String idReservation = UUID.randomUUID().toString();
        Date dateReservation = new Date();
        Reservation nouvelleReservation = new Reservation(idReservation, personne, missionDisponible, dateReservation, false);
        reservations.add(nouvelleReservation);
        missionDisponible.getReservations().add(nouvelleReservation);

        System.out.println("Réservation effectuée avec succès !");
        return nouvelleReservation;
    }


    /**
     * Méthode qui va rechercher les missions par rapport à leur destination
     * @param destination : destination de la mission
     * @return : une liste des missions qui vont jusqu'à la destination en paramètre
     */
    public List<Mission> rechercherMissions(String destination){
        List<Mission> missionChoisies = new ArrayList<>();
        for(Mission mission : this.missions){
            if(mission.getDestination().equalsIgnoreCase(destination)){
                missionChoisies.add(mission);
            }
        }
        return missionChoisies;
    }

    /**
     * Méthode qui sauvegarder les données dans un fichier
     * @param fichier : fichier de sauvegarde des données
     */
    public void sauvegarderDonnees(String fichier){
        System.out.println("Les données sont sauvegardées dans le fichier : " + fichier);
    }

    /**
     * Méthode qui va charger des données depuis un fichier
     * @param fichier : fichier où seront chargées les données
     */
    public void chargerDonnees(String fichier){
        System.out.println("Les données ont été chargées depuis le fichier : " + fichier);
    }

    public void afficherVaisseaux(List<Vaisseau> vaisseaux){
        if(vaisseaux==null || vaisseaux.isEmpty()){
            System.out.println("La liste de vaisseaux est vide. Aucun vaisseau n'est disponible");
            return;
        }else{
            System.out.println("\nListe des vaisseaux : ");
            for(Vaisseau vaisseau : vaisseaux){
                System.out.println(vaisseau);
            }
        }
    }

    public void afficherPersonnes(List<Personne> personnes){
        if(personnes==null || personnes.isEmpty()){
            System.out.println("La liste de personnes est vide. Aucune personne n'est disponible");
            return;
        }else{
            System.out.println("\nListe des personnes : ");
            for(Personne personne : personnes){
                System.out.println(personne);
            }
        }
    }
    
}

package fr.starfleet.systeme;

import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.personne.Personne;
import fr.starfleet.modele.reservation.Reservation;
import fr.starfleet.modele.vaisseau.Vaisseau;
import java.io.Serializable;
import java.util.*;

/**Classe SystemeReservation */
public class SystemeReservation implements Serializable{
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

    public Vaisseau getVaisseauParId(String idVaisseau) {
        for (Vaisseau vaisseau : this.vaisseaux) { 
            if (vaisseau.getImmatriculation().equals(idVaisseau)) { 
                return vaisseau;
            }
        }
        return null; 
    }

    public Personne getPersonneParId(String idPersonne) {
        for (Personne personne : this.personnes) { 
            if (personne.getIdentifiant().equals(idPersonne)) { 
                return personne;
            }
        }
        return null; 
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
     * Méthode pour supprimer un vaisseau par son immatriculation
     * @param idVaisseau : immatriculation du vaisseau à supprimer
     */
    public void supprimerVaisseau(String idVaisseau){
        Vaisseau vaisseauSupp = null;
        for(Vaisseau vaisseau : vaisseaux){
            if(vaisseau.getImmatriculation().equals(idVaisseau)){
                vaisseauSupp = vaisseau;
                break;
            }
        }
        if(vaisseauSupp!= null){
            vaisseaux.remove(vaisseauSupp);
            System.out.println("Vaisseau supprimé avec succès");
        }else{
            System.out.println("Vaisseau non trouvé");
        }
    }

    /**
     * Méthode qui va ajouter une personne à la liste des personnes du système de réservation
     * @param personne : personne à ajouter
     */
    public void ajouterPersonne(Personne personne){
        this.personnes.add(personne);
    }

    /**
     * Méthode pour supprimer une personne par son identifiant
     * @param idPersonne : identifiant de la personne à supprimer
     */
    public void supprimerPersonne(String idPersonne){
        Personne personneSupp = null;
        for(Personne personne : personnes){
            if(personne.getIdentifiant().equals(idPersonne)){
                personneSupp = personne;
            }
        }
        if(personneSupp!=null){
            personnes.remove(personneSupp);
            System.out.println("La personne a bien été supprimée avec succès");
        }else{
            System.out.println("La personne n'a pas été trouvée");
        }
    }

    /**
     * Méthode qui va créer une mission à ajotuer à la liste des missions du système de réservation
     * @param mission : mission à ajouter
     */
    public void creerMission(Mission mission){
        this.missions.add(mission);
    }

    /**
     * Méthode pour supprimer une mission par son identifiant
     * @param idMission : identifiant de la mission à supprimer
     */
    public void supprimerMission(String idMission){
        Mission missionASupprimer = null;
        for (Mission mission : missions) {
            if (mission.getCode().equals(idMission)) {
                missionASupprimer = mission;
            }
        }
        if (missionASupprimer != null) {
            missions.remove(missionASupprimer);
            System.out.println("Mission supprimée avec succès !");
        } else {
            System.out.println("Mission non trouvée.");
        }
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
     * Méthode pour supprimer une réservation par son identifiant
     * @param idReservation : identifiant de la réservation à supprimer
     */
    public void supprimerReservation(String idReservation) {
        Reservation reservationASupprimer = null;
        for (Reservation reservation : reservations) {
            if (reservation.getIdReservation().equals(idReservation)) {
                reservationASupprimer = reservation;
                break;
            }
        }
        if (reservationASupprimer != null) {
            reservations.remove(reservationASupprimer);
            System.out.println("Réservation supprimée avec succès !");
        } else {
            System.out.println("Réservation non trouvée.");
        }
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
        }else{
            System.out.println("\nListe des personnes : ");
            for(Personne personne : personnes){
                System.out.println(personne);
            }
        }
    }

    public void afficherMissions(List<Mission> missions){
        if(missions==null || missions.isEmpty()){
            System.out.println("La liste des missions est vide. Aucune mission n'est disponible");
        }else{
            System.out.println("\nListe des missions : ");
            for(Mission mission : missions){
                System.out.println(mission);
            }
        }
    }

    public void afficherReservations(List<Reservation> reservations){
        if(reservations==null || reservations.isEmpty()){
            System.out.println("La liste des réservations est vide. Aucune réservatoin n'est disponible");
        }else{
            System.out.println("\nListe des réservations : ");
            for(Reservation reservation : reservations){
                System.out.println(reservation);
            }
        }
    }

    
}

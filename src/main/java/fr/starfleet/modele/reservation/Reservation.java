package starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Personne;

/**Classe réservation */
public class Reservation {
    /**Attribut idReservation de la classe reservation */
    private String idReservation;
    /**Attribut personne de la classe */
    private Personne personne;
    /**Attribut mission de la classe */
    private Mission mission;
    /**Attribut dateReservation de la classe */
    private Date dateReservation;
    /**Attribut confirmee de la classe */
    private boolean confirmee;

    /**
     * Constructeur qui permet de créer une réservation
     * @param idReservation : id de la réservation
     * @param personne : personne qui a réservé
     * @param mission : mission pour laquelle il a réservé
     * @param dateReservation : date de la réservation
     * @param confirmee : confirmation de la réservation
     */
    public Reservation(String idReservation, Personne personne, Mission mission, Date dateReservation, boolean confirmee){
        this.idReservation = idReservation;
        this.personne = personne;
        this.mission = mission;
        this.dateReservation = dateReservation;
        this.confirmee = confirmee;
    }

    /**
     * Getter qui récupère l'id de la réservation 
     * @return : l'id de la réservation
     */
    public String getIdReservation(){
        return this.idReservation;
    }

    /**
     * Setter qui modifie l'id de réservation 
     * @param idReservation : nouvel id de réservation
     */
    public void setIdReservation(String idReservation){
        this.idReservation = idReservation;
    }

    /**
     * Getter qui récupère la personne qui a fait la réservation
     * @return : la personne qui a fait la réservation
     */
    public Personne GetPersonne(){
        return this.personne;
    }

    /**
     * Setter qui modifie la personne qui a effectué la réservation
     * @param newPersonne : nouvelle personne qui effectue la réservation
     */
    public void setPersonne(Personne newPersonne){
        this.personne = newPersonne;
    }

    /**
     * Getter qui récupère la mission pour la réservation
     * @return : la mission
     */
    public Mission getMission(){
        return this.mission;
    }

    public void setMission(Mission newMission){
        this.mission = newMission;
    }

    public Date getDateReservation(){
        return this.dateReservation;
    }

    public void setDateReservation(Date newDate){
        this.dateReservation = newDate;
    }

    public boolean getConfirmation(){
        return this.confirmee;
    }

    public void setConfirmation(boolean newConfirmation){
        this.confirmee = newConfirmation;
    }

    public void confirmer(){
        
    }

    public void annuler(){

    }

    
}

package fr.starfleet.modele.reservation;

import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.personne.Personne;
import java.io.Serializable;
import java.util.*;

/**Classe réservation */
public class Reservation implements Serializable{
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

    /**
     * Setter qui permet de modifier actuelle
     * @param newMission : nouvelle mission 
     */
    public void setMission(Mission newMission){
        this.mission = newMission;
    }

    /**
     * Getter qui permet de récupérer la date de réservation
     * @return : la date de la réservation
     */
    public Date getDateReservation(){
        return this.dateReservation;
    }

    /**
     * Setter qui permet de modifier la date de réservation
     * @param newDate : nouvelle date de réservation
     */
    public void setDateReservation(Date newDate){
        this.dateReservation = newDate;
    }

    /**
     * Getter qui permet de récupérer la confirmation la mission
     * @return : true si la mission est confirmée
     */
    public boolean getConfirmation(){
        return this.confirmee;
    }

    /**
     * Setter qui permet de modifier la confirmation de la mission
     * @param newConfirmation : booléen pour dire si la mission est confirmer ou non
     */
    public void setConfirmation(boolean newConfirmation){
        this.confirmee = newConfirmation;
    }

    /**
     * Méthode pour confirmer une réservation
     */
    public void confirmer(){
        if(!this.confirmee){
            this.confirmee = true;
            System.out.println("La réservation " + this.idReservation + " a été confirmée");
        }else{
            System.out.println("La réservation " + this.idReservation + " a déjà été confirmée");
        }
    }

    /**
     * Méthode pour annuler une réservation
     */
    public void annuler(){
        if(this.confirmee){
            this.confirmee = false;
            System.out.println("La réservation " + this.idReservation + " a été annulée");
        }else{
            System.out.println("La réservation " + this.idReservation + " a déjà été annulée"); 
        }
    }

    /**
     * Méthode toString pour afficher une description de la réservation
     * @return : une description de la réservation
     */
    @Override
    public String toString() {
        return "Reservation{" +
            "id='" + idReservation + '\'' +
            ", personne=" + personne.getNom() + " " + personne.getPrenom() +
            ", mission=" + mission.getCode() +
            ", dateReservation=" + dateReservation +
            '}';
}


    
}

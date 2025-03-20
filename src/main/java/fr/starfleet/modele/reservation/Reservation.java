package starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Personne;

public class Reservation {
    private String idReservation;
    private Personne personne;
    private Mission mission;
    private Date dateReservation;
    private boolean confirmee;

    public Reservation(String idReservation, Personne personne, Mission mission, Date dateReservation, boolean confirmee){
        this.idReservation = idReservation;
        this.personne = personne;
        this.mission = mission;
        this.dateReservation = dateReservation;
        this.confirmee = confirmee;
    }

    public String getIdReservation(){
        return this.idReservation;
    }

    public void setIdReservation(String idReservation){
        this.idReservation = idReservation;
    }

    public Personne GetPersonne(){
        return this.personne;
    }

    public void setPersonne(Personne newPersonne){
        this.personne = newPersonne;
    }

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

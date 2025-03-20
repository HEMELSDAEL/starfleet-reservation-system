package starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation.Reservation;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau.Vaisseau;

public class Mission {
    private String code;
    private String description;
    private Date dateDepart;
    private Date dateRetour;
    private String destination;
    private Vaisseau vaisseau;
    private List<Reservation> reservations;
    private int capaciteMaximale;

    public Mission(String code, String description, Date dateDepart, Date dateRetour, String destination, Vaisseau vaisseau, List<Reservation> reservations, int capaciteMaximale){
        this.code = code;
        this.description = description;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.destination = destination;
        this.vaisseau = vaisseau;
        this.reservations = reservations;
        this.capaciteMaximale = capaciteMaximale;
    }

    public String getCode(){
        return this.code;
    }

    public String getDescription(){
        return this.description;
    }

    public Date getDateDepart(){
        return this.dateDepart;
    }

    public Date getDateRetour(){
        return this.dateRetour;
    }

    public String getDestination(){
        return this.destination;
    }

    public Vaisseau getVaisseau(){
        return this.vaisseau;
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }

    public int getNombrePlacesDisponibles(){
        return this.capaciteMaximale;
    }

    public boolean ajouterReservation(Reservation reservation){
        return this.reservations.add(reservation);
    }

    public boolean annulerReservation(String idReservation){
        for (Reservation res : this.reservations) {
            if (res.getIdReservation().equals(idReservation)) {
                this.reservations.remove(res);
                return true;
            }
        }
        System.out.println("Réservation introuvable.");
        return false;
    }
    
}

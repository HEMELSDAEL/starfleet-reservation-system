package starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation.Reservation;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau.Vaisseau;
/**Classe Mission */
public class Mission {
    /**Attribut code de la mission */
    private String code;
    /**Attribut descrription de la mission */
    private String description;
    /**Attribut dateDepart de la mission */
    private Date dateDepart;
    /**Attribut dateRetour de la mission */
    private Date dateRetour;
    /**Attribute destination de la mission */
    private String destination;
    /**Attribut vaisseau qui correspond au vaisseau de la mission */
    private Vaisseau vaisseau;
    /**Attribut reservations qui correpsond aux reservations de la mission */
    private List<Reservation> reservations;
    /**Attribut capaciteMaximale qui correspond au nombre de gens qui peuvent venir dans la mission */
    private int capaciteMaximale;

    /**
     * Constructeur qui permet de créer une mission
     * @param code : code de la mission
     * @param description : description de la mission
     * @param dateDepart : date de depart de la mission
     * @param dateRetour : date de retour de la mission
     * @param destination : destination de la mission
     * @param vaisseau : vaisseau de la mission
     * @param reservations : reservations de la mission
     * @param capaciteMaximale : capacite maximale du vaisseau pour aller en mission
     */
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

    /**
     * Getter qui récupère le code de la mission
     * @return : le code de la mission
     */
    public String getCode(){
        return this.code;
    }

    /**
     * Setter qui permet de changer le code de la mission
     * @param newCode : nouveau code de la mission
     */
    public void setCode(String newCode){
        this.code = newCode;
    }
    
    /**
     * Getter qui permet de récupérer la description de la mission
     * @return : la description de la mission
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Setter qui permet de modifier la description de la mission
     * @param newDescription : nouvelle description
     */
    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    /**
     * Getter qui permet de récupérer la date de départ de la mission
     * @return : la date de départ de la mission
     */
    public Date getDateDepart(){
        return this.dateDepart;
    }

    /**
     * Setter qui permet de modifier la date de départ de la mission
     * @param newDateDepart : nouvelle date de départ de la mission
     */
    public void setDateDepart(Date newDateDepart){
        this.dateDepart = newDateDepart;
    }

    /**
     * Getter qui permet de récupérer la date de retour de la mission
     * @return : la date de retour de la mission
     */
    public Date getDateRetour(){
        return this.dateRetour;
    }

    /**
     * Setter qui permet de modifier la date de retour de la mission
     * @param newDateRetour : nouvelle date de retour de la mission
     */
    public void setDateRetour(Date newDateRetour){
        this.dateRetour = newDateRetour;
    }

    /**
     * Getter qui permet de récupérer la destination de la mission
     * @return : la destination de la mission
     */
    public String getDestination(){
        return this.destination;
    }

    public void setDestination(String newDestination){
        this.destination = newDestination;
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

package starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;

public class Vaisseau {
    private String nom;
    private String immatriculation;
    private int capaciteMaximale;
    private List<Mission> missions;
    
    public Vaisseau(String nom, String immatriculation, int capaciteMaximale, List<Mission> missions){
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.capaciteMaximale = capaciteMaximale;
        this.missions = new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String newNom){
        this.nom = newNom;
    }

    public String getImmatriculation(){
        return this.immatriculation;
    }

    public void setImmatriculation(String newImmat){
        this.immatriculation = newImmat;
    }

    public int getCapaciteMaximale(){
        return this.capaciteMaximale;
    }

    public void setCapaciteMaximale(int newCapacite){
        this.capaciteMaximale = newCapacite;
    }

    public List<Mission> getMissions(){
        return this.missions;
    }

    public void ajouterMission(Mission mission){
        this.missions.add(mission);
    }

    

}

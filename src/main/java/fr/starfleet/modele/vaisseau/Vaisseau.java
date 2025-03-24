package starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;

/**Classe Vaisseau du projet */
public class Vaisseau {
    /**Attribut nom du vaisseau */
    private String nom;
    /**Attribut immatriculation du vaisseau */
    private String immatriculation;
    /**Attribut capaciteMaximale du vaisseau */
    private int capaciteMaximale;
    /**Attribut liste de missions du vaisseau */
    private List<Mission> missions;
    
    /**
     * Constructeur qui permet de créer un vaisseau
     * @param nom : nom du vaisseau
     * @param immatriculation : immatriculation du vaisseau
     * @param capaciteMaximale : capacité maximale du vaisseau
     * @param missions : missions du vaisseau
     */
    public Vaisseau(String nom, String immatriculation, int capaciteMaximale, List<Mission> missions){
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.capaciteMaximale = capaciteMaximale;
        this.missions = new ArrayList<>();
    }

    /**
     * Getter qui permet de récupérer le nom du vaisseau
     * @return : le nom du vaisseau
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Setter qui permet de modifier le nom du vaisseau
     * @param newNom : nouveau nom du vaisseau
     */
    public void setNom(String newNom){
        this.nom = newNom;
    }

    /**
     * Getter qui permet de récupérer l'immatriculation du vaisseau
     * @return : l'immatriculation du vaisseau 
     */
    public String getImmatriculation(){
        return this.immatriculation;
    }

    /**
     * Setter qui permet de modifier l'immatriculation du vaisseau
     * @param newImmat : nouvelle immatriculation du vaisseau
     */
    public void setImmatriculation(String newImmat){
        this.immatriculation = newImmat;
    }

    /**
     * Getter qui permet de récupérer la capacité maximale du vaisseau
     * @return : la capacité maximale du vaisseau
     */
    public int getCapaciteMaximale(){
        return this.capaciteMaximale;
    }

    /**
     * Setter qui permet de modifier la capacité maximale du vaisseau
     * @param newCapacite : nouvelle capacité du vaisseau
     */
    public void setCapaciteMaximale(int newCapacite){
        this.capaciteMaximale = newCapacite;
    }

    /**
     * Getter qui permet de récupérer la liste des missions du vaisseau
     * @return : la liste des missions du vaisseau
     */
    public List<Mission> getMissions(){
        return this.missions;
    }

    /**
     * Méthode qui permet d'ajouter une mission à la liste des missions du vaisseau
     * @param mission : mission à ajouter
     */
    public void ajouterMission(Mission mission){
        this.missions.add(mission);
    }

    

}

package starfleet_reservation_system.src.main.java.fr.starfleet.systeme;

import java.util.*;

import starfleet_reservation_system.src.main.java.fr.starfleet.modele.mission.Mission;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne.Personne;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.reservation.Reservation;
import starfleet_reservation_system.src.main.java.fr.starfleet.modele.vaisseau.Vaisseau;


public class SystemeReservation {
    private List<Vaisseau> vaisseaux;
    private List<Personne> personnes;
    private List<Mission> missions;
    private List<Reservation> reservations;

    public SystemeReservation(List<Vaisseau> vaisseaux, List<Personne> personnes, List<Mission> missions, List<Reservation> reservations ){
        this.vaisseaux = vaisseaux;
        this.personnes = personnes;
        this.missions = missions;
        this.reservations = reservations;
    }

    public List<Vaisseau> getVaisseaux(){
        return this.vaisseaux;
    }

    public void setVaiseaux(List<Vaisseau> newVaisseau){
        this.vaisseaux = newVaisseau;
    }

    public List<Personne> getPersonnes(){
        return this.personnes;
    }

    public void setPersonne(List<Personne> newPersonne){
        this.personnes = newPersonne;
    }

    public List<Mission> getMissions(){
        return this.missions;
    }

    public void setMissions(List<Mission> newMission){
        this.missions = newMission;
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }

    public void setReservation(List<Reservation> newReservation){
        this.reservations = newReservation;
    }

    public void ajouterVaisseau(Vaisseau vaisseau){
        this.vaisseaux.add(vaisseau);
    }

    public void ajouterPersonne(Personne personne){
        this.personnes.add(personne);
    }

    public void creerMission(Mission mission){
        this.missions.add(mission);
    }

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


    public List<Mission> rechercherMissions(String destination){
        List<Mission> missionChoisies = new ArrayList<>();
        for(Mission mission : this.missions){
            if(mission.getDestination().equalsIgnoreCase(destination)){
                missionChoisies.add(mission);
            }
        }
        return missionChoisies;
    }

    public void sauvegarderDonnees(String fichier){
        System.out.println("Les données sont sauvegardées dans le fichier : " + fichier);
    }

    public void chargerDonnees(String fichier){
        System.out.println("Les données ont été chargées depuis le fichier : " + fichier);
    }


    
}

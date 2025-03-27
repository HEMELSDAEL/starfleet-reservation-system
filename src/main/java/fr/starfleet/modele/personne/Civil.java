package fr.starfleet.modele.personne;

import java.io.Serializable;

/**Classe Civil qui hérite de la classe Personne */
public class Civil extends Personne implements Serializable{
    /**Attribut planeteOrigine du civil */
    private String planeteOrigine;
    /**Attribut motifVoyage du civil */
    private String motifVoyage;

    /**
     * Constructeur de la classe Civil pour créer un objet Civil
     * @param nom : nom du civil
     * @param prenom : prenom du civil
     * @param identifiant : identifiant du civil
     * @param planeteOrigine : planete d'origine du civil
     * @param motifVoyage : motif du voyage du civil
     */
    public Civil(String nom, String prenom, String identifiant, String planeteOrigine, String motifVoyage){
        super(nom, prenom, identifiant);
        this.planeteOrigine = planeteOrigine;
        this.motifVoyage = motifVoyage;
    }

    /**
     * Getter pour récupérer la planète d'origine du civil
     * @return : la planète d'origine du civil
     */
    public String getPlaneteOrigine(){
        return this.planeteOrigine;
    }

    /**
     * Setter pour modifier la planète d'origine du civil
     * @param newPlanete : nouvelle planète d'origine
     */
    public void setPlaneteOrigine(String newPlanete){
        this.planeteOrigine = newPlanete;
    }

    /**
     * Getter pour récupérer le motif du voyage
     * @return : le motif du voyage du civil
     */
    public String getMotifVoyage(){
        return this.motifVoyage;
    }

    /**
     * Setter pour modifier le motif du voyage
     * @param newMotif : nouveau motif
     */
    public void setMotifVoyage(String newMotif){
        this.motifVoyage = newMotif;
    }

    /**
     * Méthode pour afficher la description du civil
     * @return : la description du civil
     */
    @Override
    public String getDescription(){
        return "Le civil s'appelle " + getNom() + " , " + getPrenom() + " et sa planète d'origine est : " + this.getPlaneteOrigine() + " et il vient pour le motif : " + this.getMotifVoyage();
    }
    
}

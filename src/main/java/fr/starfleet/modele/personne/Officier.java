package fr.starfleet.modele.personne;

import java.io.Serializable;

/**Classe Officer qui hérite de la classe Personne */
public class Officier extends Personne implements Serializable{
    /**Attribut rang de l'officier */
    private String rang;
    /**Attribut specialite de l'officer */
    private String specialite;

    /**
     * Constructeur qui permet de créer un officier
     * @param nom : nom de l'officier
     * @param prenom : prenom de l'officier
     * @param identifiant : identifiant de l'officier
     * @param rang : rang de l'officier
     * @param specialite : specialite de l'officer
     */
    public Officier(String nom, String prenom, String identifiant, String rang, String specialite){
        super(nom, prenom, identifiant);
        this.rang = rang;
        this.specialite = specialite;
    }

    /**
     * Getter qui recupère le rang de l'officier
     * @return : le rang de l'officer
     */
    public String getRang(){
        return this.rang;
    }

    /**
     * Setter qui permet de modifier le rang de l'officier
     * @param newRang : nouveau rang de l'officier
     */
    public void setRang(String newRang){
        this.rang = newRang;
    }

    /**
     * Getter qui permet de récupérer la spécialité de l'officier
     * @return : la spécialité de l'officier
     */
    public String getSpecialite(){
        return this.specialite;
    }

    /**
     * Setter qui permet de changer la spécialité de l'officier
     * @param newSpecialite : nouvelle spécialité de l'officier
     */
    public void setSpecialite(String newSpecialite){
        this.specialite = newSpecialite;
    }

    /**
     * Méthode qui permet d'afficher une description détaillée de l'officier
     * @return : une description détaillée de l'officier
     */
    @Override
    public String getDescription(){
        return "Cet officier s'appelle : " + super.getNom() + " , " + super.getPrenom() + " son rang est : " + this.getRang() + " et sa spécialité est : " + this.getSpecialite();
    }
    
}

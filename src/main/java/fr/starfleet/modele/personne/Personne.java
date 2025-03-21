package starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne;
/**Classe personne */
public abstract class Personne {
    /**Attribut nom*/
    private String nom;
    /**Attribut prenom */
    private String prenom;
    /**Attribut identifiant */
    private String identifiant;

    /**
     * Constructeur de la classe Personne
     * @param nom : nom de la personne
     * @param prenom : prenom de la personne
     * @param identifiant : identifiant de la personne
     */
    public Personne(String nom, String prenom, String identifiant){
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    /**
     * Getter pour récupérer le nom de la personne
     * @return : le nom de la personne
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Setter pour modifier le nom de la personne
     * @param newNom : nouveau nom de la personne
     */
    public void setNom(String newNom){
        this.nom = newNom;
    }

    /**
     * Getter pour récupérer le prénom de la personne
     * @return : le prénom de la personne
     */
    public String getPrenom(){
        return this.prenom;
    }

    /**
     * Setter pour modifier le prénom de la personne
     * @param newPrenom : nouveau prénom de la personne
     */
    public void setPrenom(String newPrenom){
        this.prenom = newPrenom;
    }

    /**
     * Getter qui va récupérer l'identifiant de la personne
     * @return : l'identifiant de la personne
     */
    public String getIdentifiant(){
        return this.identifiant;
    }

    /**
     * Setter qui va modifier l'identifiant de la personne
     * @param newId : nouvel identifiant de la personne
     */
    public void setIdentifiant(String newId){
        this.identifiant = newId;
    }

    /**
     * Méthode abstraite pour implémenter une description
     * @return : la description de la personne
     */
    public abstract String getDescription();
}

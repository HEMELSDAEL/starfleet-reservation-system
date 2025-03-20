package starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne;
public abstract class Personne {
    private String nom;
    private String prenom;
    private String identifiant;

    public Personne(String nom, String prenom, String identifiant){
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String newNom){
        this.nom = newNom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String newPrenom){
        this.prenom = newPrenom;
    }

    public String getIdentifiant(){
        return this.identifiant;
    }

    public void setIdentifiant(String newId){
        this.identifiant = newId;
    }

    public abstract String getDescription();
}

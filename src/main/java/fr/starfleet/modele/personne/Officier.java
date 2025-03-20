package starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne;

public class Officier extends Personne{
    private String rang;
    private String specialite;

    public Officier(String nom, String prenom, String identifiant, String rang, String specialite){
        super(nom, prenom, identifiant);
        this.rang = rang;
        this.specialite = specialite;
    }

    public String getRang(){
        return this.rang;
    }

    public void setRang(String newRang){
        this.rang = newRang;
    }

    public String getSpecialite(){
        return this.specialite;
    }

    public void setSpecialite(String newSpecialite){
        this.specialite = newSpecialite;
    }

    @Override
    public String getDescription(){
        return "Cet officier s'appelle : " + super.getNom() + " , " + super.getPrenom() + " son rang est : " + this.getRang() + " et sa spécialité est : " + this.getSpecialite();
    }
    
}

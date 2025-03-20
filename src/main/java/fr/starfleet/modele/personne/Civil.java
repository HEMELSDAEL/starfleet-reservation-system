package starfleet_reservation_system.src.main.java.fr.starfleet.modele.personne;

public class Civil extends Personne{
    private String planeteOrigine;
    private String motifVoyage;

    public Civil(String nom, String prenom, String identifiant, String planeteOrigine, String motifVoyage){
        super(nom, prenom, identifiant);
        this.planeteOrigine = planeteOrigine;
        this.motifVoyage = motifVoyage;
    }

    public String getPlaneteOrigine(){
        return this.planeteOrigine;
    }

    public void setPlaneteOrigine(String newPlanete){
        this.planeteOrigine = newPlanete;
    }

    public String getMotifVoyage(){
        return this.motifVoyage;
    }

    public void setMotifVoyage(String newMotif){
        this.motifVoyage = newMotif;
    }

    @Override
    public String getDescription(){
        return "Le civil s'appelle " + super.getNom() + " , " + super.getPrenom() + " et sa planète d'origine est : " + this.getPlaneteOrigine() + " et il vient pour le motif : " + this.getMotifVoyage();
    }
    
}

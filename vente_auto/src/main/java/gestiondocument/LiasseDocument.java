package main.java.gestiondocument;

public class LiasseDocument {
	private String demandeImmatriculation;
    private String certificatCession;
    private String bonCommande;

    //Constructeur
    public LiasseDocument(String demandeImmatriculation, String certificatCession, String bonCommande) {
        this.demandeImmatriculation = demandeImmatriculation;
        this.certificatCession = certificatCession;
        this.bonCommande = bonCommande;
    }

    //Getters et Setters
    // Getter pour demandeImmatriculation
    public String getDemandeImmatriculation() {
        return demandeImmatriculation;
    }

    // Setter pour demandeImmatriculation
    public void setDemandeImmatriculation(String demandeImmatriculation) {
        this.demandeImmatriculation = demandeImmatriculation;
    }

    // Getter pour certificatCession
    public String getCertificatCession() {
        return certificatCession;
    }

    // Setter pour certificatCession
    public void setCertificatCession(String certificatCession) {
        this.certificatCession = certificatCession;
    }

    // Getter pour bonCommande
    public String getBonCommande() {
        return bonCommande;
    }

    // Setter pour bonCommande
    public void setBonCommande(String bonCommande) {
        this.bonCommande = bonCommande;
    }

    public String afficherliasseDocument(){
        //Methode pour afficher la liasse de documents
        return "LiasseDocument{" +
                "demandeImmatriculation='" + demandeImmatriculation + '\'' +
                ", certificatCession='" + certificatCession + '\'' +
                ", bonCommande='" + bonCommande + '\'' +
                '}';
    }
}

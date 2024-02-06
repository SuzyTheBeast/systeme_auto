package main.java.commande;

//Classe abstraite pour les commandes
public class Commande {
	private int commandeID;
    private List<Vehicule> vehiculesCommandes;
    private String etat;
    private String paysLivraison;
    private String typePaiement;
    
    //Constructeur, getters et setters

    // Méthodes communes à toutes les commandes
    public abstract double calculerTaxes();
    public abstract String genererDocuments();

}

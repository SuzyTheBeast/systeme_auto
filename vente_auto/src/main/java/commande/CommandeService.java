package main.java.commande;

public class CommandeService {
	public Commande creerCommande(String etat, String paysLivraison, String typePaiement) {
        Commande nouvelleCommande = new Commande();
        nouvelleCommande.setEtat(etat);
        nouvelleCommande.setPaysLivraison(paysLivraison);
        nouvelleCommande.setTypePaiement(typePaiement);
        return nouvelleCommande;
    }

    // Autres méthodes de gestion des commandes...
}

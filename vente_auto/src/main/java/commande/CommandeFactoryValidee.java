package main.java.commande;

public class CommandeFactoryValidee extends CommandeFactory {
	public Commande createCommande() {
        Commande nouvelleCommande = new Commande();
        nouvelleCommande.setEtat(EtatCommande.VALIDE.name());
        return nouvelleCommande;
    }
}

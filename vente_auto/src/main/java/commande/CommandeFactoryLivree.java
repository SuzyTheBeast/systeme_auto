package main.java.commande;

public class CommandeFactoryLivree extends CommandeFactory{
	public Commande createCommande() {
        Commande nouvelleCommande = new Commande();
        nouvelleCommande.setEtat(EtatCommande.LIVREE.name());
        return nouvelleCommande;
    }
}

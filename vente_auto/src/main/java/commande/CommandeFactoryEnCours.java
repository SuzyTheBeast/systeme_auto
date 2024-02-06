package main.java.commande;

//Classes concretes de factory pour chaque etat de la commande
public class CommandeFactoryEnCours extends CommandeFactory {
	public Commande createCommande() {
        Commande nouvelleCommande = new Commande();
        nouvelleCommande.setEtat(EtatCommande.EN_COURS.name());
        return nouvelleCommande;
    }
}

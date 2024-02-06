package main.java.catalogue;

public class DecorateurAffichageCatalogue implements ObservateurCatalogue  {
	 protected SujetCatalogue sujetCatalogue;

	    //Constructeur prenant une instance du sujet a decorer
	    public DecorateurAffichageCatalogue(SujetCatalogue sujetCatalogue){
	        this.sujetCatalogue = sujetCatalogue;
	        sujetCatalogue.ajouterObservateur(this);
	    }

	    //Methode abstraite pour afficher le catalogue decore
	    public abstract void afficherCatalogue();
}

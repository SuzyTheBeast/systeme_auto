package main.java.catalogue;

public class DecorateurAffichagePrix extends DecorateurAffichageCatalogue {
	//Constructeur prenant une instance du sujet a decorer
    public DecorateurAffichagePrix(SujetCatalogue sujetCatalogue){
        super(sujetCatalogue);
    }

    //Methode pour afficher le catalogue decore par prix
    public void afficherCatalogue(){
        //Logique specifique pour afficher le catalogue par prix
        System.out.println("Catalogue par prix");
        sujetCatalogue.afficherCataloge();
    }

    //Methode pour mettre a jour le catalogue lorsqu'un vehicule est ajoute
    public void mettreAJour(Vehicule vehicule){
        afficherCatalogue();
    }
}

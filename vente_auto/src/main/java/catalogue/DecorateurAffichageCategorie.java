package main.java.catalogue;

public class DecorateurAffichageCategorie extends DecorateurAffichageCatalogue{
	 //Constructeur prenant une instance du sujet a decorer
    public DecorateurAffichageCategorie(SujetCatalogue sujetCatalogue){
        super(sujetCatalogue);
    }

    //Methode pour afficher le catalogue decorer par categorie
    public void afficherCatalogue(){
        //Logique specifique pour afficher le catalogue par categorie
        System.out.println("Catalogue par categorie: ");
        sujetCatalogue.afficherCatalogue();
    }

    //Methode pour mettre a jour le catalogue lorsqu'un vehicule est ajoute
    public void mettreAJour(Vehicule vehicule){
        afficherCatalogue;
    }
}

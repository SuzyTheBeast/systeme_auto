package main.java.catalogue;

public class DecorateurAffichageLigne  extends DecorateurAffichageCatalogue  {
	// Constructeur prenant une instance du sujet à décorer
    public DecorateurAffichageLigne(SujetCatalogue sujetCatalogue) {
        super(sujetCatalogue);
    }

    // Méthode pour afficher le catalogue décoré par ligne
    @Override
    public void afficherCatalogue() {
        // Logique spécifique pour afficher le catalogue par ligne
        System.out.println("Catalogue par ligne :");
        for (Vehicule vehicule : sujetCatalogue.getCatalogue()) {
            System.out.println(vehicule.toString());
        }
    }

    // Méthode pour mettre à jour le catalogue lorsqu'un véhicule est ajouté ou retiré
    @Override
    public void mettreAJour(Vehicule vehicule) {
        afficherCatalogue();
    }
}

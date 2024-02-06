package main.java.catalogue;
import java.util.ArrayList;

public class ConcreteSujetCatalogue extends SujetCatalogue {
	private List<vehicule> catalogue = new ArrayList<>();

    //Methode pour ajouter un vehicule au catalogue
    public void ajouterVehicule(Vehicule vehicule){
        catalogue.add(vehicule);
        notifierObservateurs(vehicule);
    }

    //Methode pour retirer un vehicule du catalogue
    public void retirerVehicule(Vehicule vehicule){
        catalogue.remove(Vehicule);
        notifierObservateurs(vehicule);
    }

    //Methode pour afficher le catalogue
    public void afficherCatalogue(){
        for(Vehicule vehicule : catalogue){
            System.out.println(vehicule.toString())
        }
    }
}

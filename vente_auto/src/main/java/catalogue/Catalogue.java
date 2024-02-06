package main.java.catalogue;

import java.util.List;

public class Catalogue extends SujetCatalogue{
	private List<Vehicule> catalogue = new ArrayList<>();
	private SujetAnimationCatalogue sujetAnimationCatalogue = new SujetAnimationCatalogue();
	
	//Ajoutez des methodes pour gerer le catalogue (ajouter, retirer, etc.)
	public void ajouterVehicule(Vehicule vehicule) {
		catalogue.add(Vehicule vehicule);
		notifierObservateurs(vehicule);
	}
	
	public void retirerVehicule(Vehicule vehicule) {
		catalogue.remove(vehicule);
		notifierObservateurs(vehicule);
	}
	
	public void afficherCatalogue() {
		for(Vehicule vehicule : catalogue) {
			Systeme.out.println(vehicule.afficher());
		}
	}
	
	public List<Vehicule> avoirCatalogue() {
		return catalogue;
	}
	
	public void ajouterObservateurAnimation(ObservateurAnimation observateur) {
		sujetAnimationCatalogue.ajouterObservateur(observateur);
	}
	
	public void retirerObservateurAnimation(ObservateurAnimation observateur) {
		sujetAnimationCatalogue.retirerObservateur(observateur);
	}
}

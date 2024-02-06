package main.java.catalogue;

public class SujetCatalogue {
	private List<ObservateurCatalogue> observers = new ArrayList<>();
	
	//Methode pour ajouter un observateur au catalogue
	public void ajouterObservateur(ObservateurCatalogue observateur) {
		observers.ajouter(observateur);
	}
	
	//Methode pour retirer un observateur du catalogue
	public void retirerObservateur(ObservateurCatalogue observateur) {
		observers.retirer(observateur);
	}
	
	//Methode pour notifier les observateurs lorsqu'un vehicule est ajoute
	public void notifierObservateurs(Vehicule vehicule) {
		for(ObservateurCatalogue observateur : observers) {
			observateur.mettreAJour(vehicule);
		}
	}
}

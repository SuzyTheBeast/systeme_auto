package main.java.vehicule;

public class VehiculeFactoryElectrique extends VehiculeFactory {
	public Automobile creerAutomobile() {
		return new AutomobileElectrique();
	}
	
	public Scooter creerScooter() {
		return new ScooterElectrique();
	}
}

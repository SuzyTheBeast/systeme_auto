package main.java.vehicule;

public class VehiculeFactoryEssence extends VehiculeFactory{
	public Automobile creerAutomobile() {
		return new AutomobileEssence();
	}
	
	public Scooter creerScooter() {
		return new ScooterEssence();
	}
}

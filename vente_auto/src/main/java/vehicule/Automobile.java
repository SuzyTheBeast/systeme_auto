package main.java.vehicule;

public abstract class Automobile implements Vehicule {
	public int id;
	public String marque;
	public String modele;
	public String annee_fabrication;
	public float prix; 
	public String options_disponible;
	public int stock_disponible;
	
	public abstract String obtenirDetails();
	public abstract boolean verifierDisponibilite();
}

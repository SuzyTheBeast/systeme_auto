package main.java.commande;

public class ChariotVirtuel {
	// Attributs...
    protected List<Vehicule> vehiculesSelectionnes;
    protected List<Option> optionsChoisies;
    protected String etatPanier;

    // Méthodes...
    public void addVehicleToCart(Vehicule vehicle, List<Option> options) {
        // Ajoute un véhicule au panier avec les options spécifiées
    }

    public void removeVehicleFromCart(Vehicule vehicle) {
        // Retire un véhicule du panier
    }

    public void applyOptions() {
        // Applique les options choisies
    }

    public void revertToPreviousState() {
        // Revient à un état précédent du panier
    }

    // Autres méthodes...
}

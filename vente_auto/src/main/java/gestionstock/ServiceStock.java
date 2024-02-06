package main.java.gestionstock;

public class ServiceStock {
	private List<Vehicule> stock;
	
	public StockService() {
        this.stock = new ArrayList<>();
    }

    public void ajouterAuStock(Vehicule vehicule) {
        stock.add(vehicule);
    }

    public void retirerDuStock(Vehicule vehicule) {
        stock.remove(vehicule);
    }

    public void solderVehiculesAnciens(int seuilJours) {
        // Implémentation pour solder les véhicules dans le stock depuis longtemps
        // Utiliser la date d'entrée dans le stock pour déterminer la durée
        // Si la durée dépasse le seuil, retirer le véhicule du stock ou appliquer une action spécifique.
    }

    // Autres méthodes de gestion du stock...
}

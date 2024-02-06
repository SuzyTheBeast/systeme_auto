package main.java.formulaire;

public class FormulaireVenteVehicule extends Formulaire {

    public FormulaireVenteVehicule(RenduFormulaire renduFormulaire) {        
        super(renduFormulaire);    
    }

    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        System.out.println("Rendu du formulaire de vente de véhicule");
        renduFormulaire.afficherChamps();
        renduFormulaire.afficherBoutonSoumettre();
    }

    @Override
    public void soumettre() {
        // TODO Auto-generated method stub
        System.out.println("Soumission du formulaire de vente de véhicule");    
    }
}

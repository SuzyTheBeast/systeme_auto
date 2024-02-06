package main.java.formulaire;

public class FormulaireAchatVehicule extends Formulaire {

    public FormulaireAchatVehicule(RenduFormulaire renduFormulaire) {        
        super(renduFormulaire);    
    }
        
    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        System.out.println("Rendu du formulaire d'achat de véhicule");
        renduFormulaire.afficherChamps();
        renduFormulaire.afficherBoutonSoumettre();  
    }

    @Override
    public void soumettre() {
        // TODO Auto-generated method stub
        System.out.println("Soumission du formulaire d'achat de véhicule");    
    }
}


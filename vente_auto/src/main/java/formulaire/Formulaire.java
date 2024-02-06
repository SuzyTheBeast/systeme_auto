package main.java.formulaire;

//Classe abstraite pour les formulaires
public abstract class Formulaire {
    protected RenduFormulaire renduFormulaire;    
    public Formulaire(RenduFormulaire renduFormulaire) {        
        this.renduFormulaire = renduFormulaire;    
    }
    public abstract void afficher();    
    public abstract void soumettre();
}

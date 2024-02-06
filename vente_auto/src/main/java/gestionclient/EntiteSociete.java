package main.java.gestionclient;

//Classe abstraite representant une entite societe
public abstract class EntiteSociete {
	protected String nom;

    //Constructeur prenant le nom de l'entite societe
    public EntiteSociete(String nom){
        this.nom = nom;
    }

    //Metode pour afficher les details de l'entite societe
    public abstract void afficherDetails();
}

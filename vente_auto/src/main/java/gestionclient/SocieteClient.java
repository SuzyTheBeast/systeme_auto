package main.java.gestionclient;

//Classe feuille representant une societe cliente
public class SocieteClient extends EntiteSociete{
	//Constructeur prenant le nom de la societe cliente
    public SocieteClient(String nom){
        super(nom);
    }

    //Methode pour afficher les details de la societe cliente
    public void afficherDetails(){
        System.out.println("Societe Cliente : " + nom);
    }	
}

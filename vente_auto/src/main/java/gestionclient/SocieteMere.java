package main.java.gestionclient;

import java.util.List;
import java.util.ArrayList;

public class SocieteMere extends EntiteSociete {
	private List<EntiteSociete> filiales;

    //Constructeur prenant le nom de la societe mere
    public SocieteMere(String nom){
        super(nom);
        filiales = new ArrayList<>();
    }

    //Methode pour ajouter une filiale a la liste

    public void ajouterFiliales(EntiteSociete filiale){
        filiales.add(filiale);
    }

    //Methode pour retirer une filiale de la liste
    public void retirerFiliales(EntiteSociete filiale){
        filiales.remove(filiale);
    }

    //Methode pour afficher les details de la societe mere et de ses filiales
    public void afficherDetails(){
        System.out.println("Societe Mere:" + nom);
        System.out.println("Filiales: ");
        for(EntiteSociete filiale : filiales){
            filiale.afficherDetails();
        }
    }
}

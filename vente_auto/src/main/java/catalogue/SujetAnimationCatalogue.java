package main.java.catalogue;
import java.util.List;

//Sujet pour AnimationCatalogue
public class SujetAnimationCatalogue {
	private List<ObservateurAnimation> observers = new ArrayList<>();

    public void ajouterObservateur(ObservateurAnimation observateur) {
        observers.add(observateur);
    }

    public void retirerObservateur(ObservateurAnimation observateur) {
        observers.remove(observateur);
    }

    public void notifierObservateursAnimation(Vehicule vehicule) {
        for (ObservateurAnimation observateur : observers) {
            observateur.mettreAJourAnimation(vehicule);
        }
    }
}

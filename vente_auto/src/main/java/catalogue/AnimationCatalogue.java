package main.java.catalogue;

public class AnimationCatalogue implements ObservateurCatalogue {
	private SujetAnimationCatalogue sujetAnimationCatalogue;

    public AnimationCatalogue(SujetAnimationCatalogue sujetAnimationCatalogue) {
        this.sujetAnimationCatalogue = sujetAnimationCatalogue;
    }

    @Override
    public void mettreAJour(Vehicule vehicule) {
        // Logique pour gérer l'animation lors de la mise à jour du catalogue
        sujetAnimationCatalogue.notifierObservateursAnimation(vehicule);
    }
}

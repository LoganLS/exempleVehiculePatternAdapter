package fr.unilim.iut.PatternAdapter;

public class Voiture implements Vehicule{

	@Override
	public void accelerer() {
		System.out.println("J'accélère en utilisant la pédale d'accélération de la voiture");
	}

	public void freiner() {
		System.out.println("Je freine en utilisant la pédale de frein de la voiture");
	}

	public void tournerLeVolant() {
		System.out.println("Je tourne le volant de la voiture");
	}

	public void klaxonner() {
		System.out.println("Je klaxonne avec la voiture");
	}

}

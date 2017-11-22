package fr.unilim.iut.PatternAdapter;

public class Bus implements Vehicule{

	@Override
	public void accelerer() {
		System.out.println("J'accélère en utilisant la pédale d'accélération du bus");		
	}
	
	public void freiner() {
		System.out.println("Je freine en utilisant la pédale de frein du bus");
	}

	public void tournerLeVolant() {
		System.out.println("Je tourne le volant du bus");
	}

	public void klaxonner() {
		System.out.println("Je klaxonne avec le bus");
	}

}

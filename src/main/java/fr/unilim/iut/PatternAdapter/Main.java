package fr.unilim.iut.PatternAdapter;

public class Main {
	public static void main(String[] args){
		Vehicule voiture = new Voiture();
		Vehicule bus = new Bus();
		Vehicule velo = new VeloAdapter(new Velo());
		
		voiture.accelerer();
		bus.accelerer();
		velo.accelerer();
		System.out.println("\n");
		
		voiture.freiner();
		bus.freiner();
		velo.freiner();
		System.out.println("\n");
		
		voiture.tournerLeVolant();
		bus.tournerLeVolant();
		velo.tournerLeVolant();
		System.out.println("\n");
		
		voiture.klaxonner();
		bus.klaxonner();
		velo.klaxonner();
		
	}
}

package fr.unilim.iut.PatternAdapter;

public class VeloAdapter implements Vehicule{

	private Velo velo; //composition
	
	public VeloAdapter(Velo velo){
		this.velo=velo;
	}
	
	@Override
	public void accelerer() {
		this.velo.pedaler();
	}
	
	public void freiner() {
		this.velo.freiner();		
	}
	
	public void tournerLeVolant() {
		this.velo.tournerLeGuidon();
	}
	
	public void klaxonner() {
		this.velo.avertir();
	}
} 

package exo1;

public class Eleve {

	private String mNom;
	private double mNote;

	public Eleve(String nom, double note) {
		this.mNom = nom;
		this.mNote = note;
	}

	public String getNom() {
		return mNom;
	}

	public double getNote() {
		return mNote;
	}
}
package heritage;

import java.util.ArrayList;

public class Professeur extends Personne {

	private String discipline;
	private int nbClasses;

	public Professeur(String nom, String prenom, int age, ArrayList<Adresse> adresse,
			String discipline) {
		this(nom, prenom, age, adresse, discipline, 0);
	}

	public Professeur(String nom, String prenom, int age, ArrayList<Adresse> adresse,
			String discipline, int nbClasses) {
		super(nom, prenom, age, adresse);
		this.discipline = discipline;
		this.nbClasses = nbClasses;
	}

	public String getDiscipline() {
		return discipline;
	}

	public int getNbClasses() {
		return nbClasses;
	}
}
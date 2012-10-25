package heritage;

import java.util.ArrayList;

public class Eleve extends Personne {

	private Classe classe;

	public Eleve(String nom, String prenom, int age, ArrayList<Adresse> adresse, Classe c) {
		super(nom, prenom, age, adresse);
		this.classe = c;
	}

	public Classe getClasse() {
		return classe;
	}
}
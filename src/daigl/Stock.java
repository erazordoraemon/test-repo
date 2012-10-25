package daigl;

import java.util.ArrayList;

public class Stock {

	private ArrayList<Livre> lesLivres;

	public Stock() {
		lesLivres = new ArrayList<Livre>();
	}

	public void ajouter(Livre livre) {
		this.lesLivres.add(livre);
	}

	public double eval() {
		double e = 0;

		for (int i = 0; i < lesLivres.size(); i++)
			e += lesLivres.get(i).eval();

		return e;
	}

	public boolean existe(String titre) {
		boolean trouver = false;
		int i = 0;

		while (!trouver && i < this.lesLivres.size()) {
			if (this.lesLivres.get(i).getTitre().equals(titre))
				trouver = true;
			i++;
		}

		return trouver;
	}

	public ArrayList<Livre> obtenirLesLivres() {
		return this.lesLivres;
	}

	public void supprimer(String titre) {
		int index = -1;
		int i = 0;

		while (index == -1 && i < this.lesLivres.size()) {
			if (lesLivres.get(i).getTitre().equals(titre))
				index = i;
		}

		if (index != -1)
			this.lesLivres.remove(index);
	}
}
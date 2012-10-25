package dm1;

import java.util.ArrayList;


public class Banque {

	private ArrayList<Compte> lesComptes;

	public Banque() {
		lesComptes = new ArrayList<Compte>();
	}

	public void afficherLesComptes() {
		System.out.println("***** Liste des comptes de la banque *****");
		int s = this.lesComptes.size();

		for (int i = 0; i < s; i++) {
			System.out.println("Compte n°" + i + " : " + this.lesComptes.get(i).toString());
		}
	}

	public void ajouterCompte(Compte c) {
		this.lesComptes.add(c);
	}

	public float calculerDisponibilites() {
		float d = 0;
		int s = this.lesComptes.size();

		for (int i = 0; i < s; i++)
			d += this.lesComptes.get(i).getSolde();

		return d;
	}

	public boolean existe(Compte c) {
		return this.lesComptes.contains(c);
	}

	public Compte getCompte(int index) {
		return this.lesComptes.get(index);
	}

	public int getNombreComptes() {
		return this.lesComptes.size();
	}

	public Compte rechercherCompte(int numCompte) {
		Compte c = null;
		boolean trouve = false;
		int i = 0;

		while (!trouve && i < lesComptes.size()) {
			if (this.lesComptes.get(i).getNum() == numCompte) {
				c = this.lesComptes.get(i);
				trouve = true;
			}
			i++;
		}

		return c;
	}

	public void supprimerCompte(int index) {
		this.lesComptes.remove(index);
	}
}
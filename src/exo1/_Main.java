package exo1;

import java.util.Scanner;

public class _Main {

	public static void main(String[] args) {
		TabEleves tab = new TabEleves();

		tab.ajouter(new Eleve("patrick", 16));
		tab.ajouter(new Eleve("allonneau", 20));
		tab.ajouter(new Eleve("truc", 10));

		tab.supprimer(2);
		System.out.println("Nombre d'élèves : " + tab.getNombreEleves());

		Eleve e = tab.rechercher("allonneau");
		System.out.println(e);

		resultats(tab);
	}

	public static void resultats(TabEleves tab) {
		Eleve eMax = tab.valeur(0);
		Eleve eMin = tab.valeur(0);
		double total = 0;
		int n = tab.getNombreEleves();

		for (int i = 0; i < n; i++) {
			Eleve e = tab.valeur(i);
			if (eMax.getNote() == -1)
				eMax = e;
			else if (e.getNote() > eMax.getNote()){
				eMax = e;
			}
			if (eMin.getNote() == -1)
				eMin = e;
			else if (e.getNote() < eMin.getNote()){
				eMin = e;
			}

			total += e.getNote();
		}

		System.out.println("Élève ayant obtenu la meilleur note : " + eMax.getNom() + " (" + eMax.getNote() + ")");
		System.out.println("Élève ayant obtenu la pire note : " + eMin.getNom() + " (" + eMin.getNote() + ")");
		System.out.println("Moyenne de la classe : " + total/n);
	}

	public static Eleve saisirEleve() {
		Eleve e;
		String nom = "";
		double note = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Saisir le nom de l'élève : ");
		nom = scan.nextLine();
		System.out.print("Saisir la note de l'élève : ");
		note = scan.nextDouble();

		e = new Eleve(nom, note);

		return e;
	}
}
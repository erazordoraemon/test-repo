package heritage;

import java.util.ArrayList;

public class _Main {

	class Objet {

		private Object valeur;

		public Objet() {
			valeur = 0;
		}

		public Objet(Object valeur) {
			this.valeur = valeur;
		}
	}

	public static void main(String[] args) {
		Classe c = new Classe(30);

		ArrayList<Adresse> addrs = new ArrayList<Adresse>();
		addrs.add(new Adresse("rue George sand", "Vigneux sur Seine", "91270"));
		addrs.add(new Adresse("rue des Camomilles", "Deauville", "12345"));

		Eleve e1 = new Eleve("Allonneau", "Mickael", 21, addrs, c);
		Eleve e2 = new Eleve("Penture", "Kylian", 23, addrs, c);
	}
}
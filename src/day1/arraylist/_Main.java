package day1.arraylist;

import java.util.ArrayList;

public class _Main {

	public static void main(String[] args) {
		Adresse adr = new Adresse("Rue George Sand", "Vigneux", "91270");
		Adresse adr2 = new Adresse("Rue des camélias", "Draveil", "91310");

		ArrayList<Adresse> adrs = new ArrayList<Adresse>();
		adrs.add(adr);
		adrs.add(adr2);

		Personne p = new Personne("allonneau", "mickael", 1991, adrs);
		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());
	}
}
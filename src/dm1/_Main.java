package dm1;


public class _Main {

	public static void main(String[] args) {
		Compte c1 = new Compte(123, "mike");
		Compte c2 = new Compte(456, "will");
		Banque b = new Banque();

		b.ajouterCompte(c1);
		b.ajouterCompte(c2);
		c1.versement(1000);

		System.out.println("c1 -> " + c1);
		System.out.println("c2 -> " + c2);
		System.out.println("Disponibilités de la banque : " + b.calculerDisponibilites());

		c1.retrait(250);
		c2.versement(200);

		System.out.println("c1 -> " + c1);
		System.out.println("c2 -> " + c2);
		System.out.println("Disponibilités de la banque : " + b.calculerDisponibilites());

		c1.versement(250);
		c2.versement(1300);

		b.afficherLesComptes();
	}
}
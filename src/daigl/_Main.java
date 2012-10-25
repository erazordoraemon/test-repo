package daigl;

public class _Main {

	public static void main(String[] args) {
		Stock s = new Stock();
		Livre l1 = new Livre("Apprendre le Java", 25);
		Livre l2 = new Livre("Le foot à l'état pur", 20, 5);

		s.ajouter(l1);
		s.ajouter(l2);

		double eval = s.eval();
		if (eval == (20*5+25))
			System.out.println("OK");
		else
			System.out.println("ERREUR");
	}
}
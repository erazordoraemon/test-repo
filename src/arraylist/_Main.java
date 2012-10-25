package arraylist;

import java.util.ArrayList;

public class _Main {

	public static void afficher(ArrayList<Integer> liste) {
		for (Integer i : liste) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(6);
		liste.add(4);
		liste.add(2);

		afficher(liste);

		liste.remove(new Integer(6));

		afficher(liste);
	}
}
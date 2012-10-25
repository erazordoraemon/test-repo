package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _Main {

	static File fList = new File("liste.abc");
	static File fObj = new File("objet.abc");

	public static ArrayList<Personne> deserializerListe() {
		ArrayList<Personne> liste = null;

		try {
			FileInputStream fis = new FileInputStream(fList);
			ObjectInputStream ois = new ObjectInputStream(fis);

			liste = (ArrayList<Personne>) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return liste;
	}

	public static Personne deserializerPersonne() {
		Personne p = null;

		try {
			FileInputStream fis = new FileInputStream(fObj);
			ObjectInputStream ois = new ObjectInputStream(fis);

			p = (Personne) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return p;
	}

	public static void main(String[] args) {
		testSerializationPersonne();
//		testDeserializationPersonne();
//		testSerializationPersonne();
//		testDeserializationListe();
	}

	public static void serializer(ArrayList<Personne> lPers) {
		try {
			FileOutputStream fos = new FileOutputStream(fList);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lPers);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void serializer(Personne p) {
		try {
			FileOutputStream fos = new FileOutputStream(fObj);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(p);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testDeserializationListe() {
		ArrayList<Personne> listePersonnes = deserializerListe();

		Personne p = listePersonnes.get(0);
		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());
	}

	public static void testDeserializationPersonne() {
		Personne p = deserializerPersonne();

		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());
	}

	public static void testSerializationListe() {
		ArrayList<Personne> listePersonnes = new ArrayList<Personne>();
		ArrayList<Adresse> adrs = new ArrayList<Adresse>();

		adrs.add(new Adresse("Rue George Sand", "Vigneux", "91270"));
		adrs.add(new Adresse("Rue des camélias", "Draveil", "91310"));

		listePersonnes.add(new Personne("allonneau", "mickael", 1991, adrs));
		listePersonnes.add(new Personne("allonneau", "mickael", 1991, adrs));

		Personne p = listePersonnes.get(0);
		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());
		serializer(listePersonnes);
	}

	public static void testSerializationPersonne() {
		Adresse adr = new Adresse("Rue George Sand", "Vigneux", "91270");
		Adresse adr2 = new Adresse("Rue des camélias", "Draveil", "91310");

		ArrayList<Adresse> adrs = new ArrayList<Adresse>();
		adrs.add(adr);
		adrs.add(adr2);

		Personne p = new Personne("allonneau", "mickael", 1991, adrs);
		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());

		serializer(p);
	}
}
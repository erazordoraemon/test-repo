package day1;

public class _Main {

	public static void main(String[] args) {
		Adresse addr = new Adresse("Rue George Sand", "Vigneux", "91270");
		Adresse addr2 = new Adresse("Rue des camélias", "Draveil", "91310");
		
		Adresse[] addrs = new Adresse[] {
				addr,
				addr2
		};
		
		Personne p = new Personne("allonneau", "mickael", 1991, addrs);
		System.out.println(p.toString());
		System.out.println("Login: " + p.getLogin() + "\nMot de passe: " + p.getPassword());
	}
}
package junit;

public class Personne {

	private String nom;
	private String prenom;
	private String login;

	public Personne(String unNom, String unPrenom) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = creerLogin();
	}

	private String creerLogin() {
		String login = (this.prenom.charAt(0) + this.nom)
		.toLowerCase()
		.replace("-", "")
		.replace(" ", "");

		if (login.length() > 6)
			login = login.substring(0, 6);

		return login;
	}

	public String getLogin() {
		return this.login;
	}

	public String toString() {
		return ("Nom : " + this.nom + " Prenom : " + this.prenom + " Login : " + this.login);
	}
}
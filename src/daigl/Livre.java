package daigl;

public class Livre {

	private String titre;
	private double prix;
	private int nbExemplaires;

	public Livre(String titre, double prix) {
		this(titre, prix, 1);
	}

	public Livre(String titre, double prix, int nb) {
		this.titre = titre;
		this.prix = prix;
		this.nbExemplaires = nb;
	}

	public double eval() {
		return (double)nbExemplaires * prix;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public double getPrix() {
		return prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setNbExemplaires(int nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
}
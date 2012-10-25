package dm1;


public class Compte {

	private String nomprop;
	private int num;
	private float solde;

	public Compte(int num, String nom) {
		this.num = num;
		this.nomprop = nom;
		this.solde = 0;
	}

	public String getNomprop() {
		return nomprop;
	}

	public int getNum() {
		return num;
	}

	public float getSolde() {
		return this.solde;
	}

	public void retrait(float montant) {
		this.solde -= montant;
	}

	@Override
	public String toString() {
		return 	"Compte n°" + this.num
		+ " - enregistré au nom de " + this.nomprop
		+ " - solde du compte : " + this.solde;
	}

	public void versement(float montant) {
		this.solde += montant;
	}
}
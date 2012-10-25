package day1;

/**
 * Séance de révision du 11/09/2012.
 * @author mallonneau
 *
 */
public class Personne {

	private static int COMPTEUR = 0;

	public static int getNombreInstances() {
		return COMPTEUR;
	}

	private String mNom;
	private String mPrenom;
	private int mAnneeNaissance;
	private String mLogin;
	private String mPassword;
	private Adresse[] mAdresse;

	public Personne(String nom, String prenom, int age, Adresse[] adresse) {
		COMPTEUR++;
		this.mNom = nom;
		this.mPrenom = prenom;
		this.mAnneeNaissance = age;
		this.mAdresse = adresse;
		generateLogin();
	}

	private void generateLogin() {
		if (mPrenom != null
				&& mNom != null) {
			String str = "";
			char c = mPrenom.charAt(0);

			str += c;
			str += mNom;

			mLogin = str.toLowerCase();
			mPassword = str.toUpperCase();
		}
	}

	public Adresse[] getAdresse() {
		return mAdresse;
	}

	public int getAnneeNaissance() {
		return mAnneeNaissance;
	}

	public String getLogin() {
		return mLogin;
	}

	public String getNom() {
		return mNom;
	}

	public String getPassword() {
		return mPassword;
	}

	public String getPrenom() {
		return mPrenom;
	}

	public void setAdresse(Adresse[] adresse) {
		this.mAdresse = adresse;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.mAnneeNaissance = anneeNaissance;
	}

	public void setNom(String nom) {
		this.mNom = nom;
		generateLogin();
	}

	/**
	 * Modifie le prénom.
	 * @param prenom - Le nouveau prénom
	 */
	public void setPrenom(String prenom) {
		this.mPrenom = prenom;
		generateLogin();
	}

	@Override
	public String toString() {
		return "Nom: " + mNom + "\nPrénom: " + mPrenom
		+ "\nAnnée de naissance: " + mAnneeNaissance
		+ "\nNombre d'adresses: " + mAdresse.length;
	}
}
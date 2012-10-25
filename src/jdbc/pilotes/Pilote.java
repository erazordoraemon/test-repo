package jdbc.pilotes;

public class Pilote {

	private int		mId;
	private String	mNom;
	private String	mPrenom;

	public Pilote(int id, String nom, String prenom) {
		this.mId = id;
		this.mNom = nom;
		this.mPrenom = prenom;
	}

	public int getId() {
		return mId;
	}

	public String getNom() {
		return mNom;
	}

	public String getPrenom() {
		return mPrenom;
	}
}
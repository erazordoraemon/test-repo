package tp_passerelle_bd;

public class Pilote {

	private int		mId;
	private String	mNom;
	private String	mPrenom;
	private Brevet	mBrevet;

	public Pilote(int id, String nom, String prenom, Brevet b) {
		this.mId = id;
		this.mNom = nom;
		this.mPrenom = prenom;
		this.mBrevet = b;

		b.ajouterPilote(this);
	}

	public Brevet getBrevet() {
		return mBrevet;
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

	@Override
	public String toString() {
		return "Pilote[" + mId + " - " + mNom + " - " + mPrenom + " - " + mBrevet + "]";
	}
}
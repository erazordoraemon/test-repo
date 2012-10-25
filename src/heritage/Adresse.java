package heritage;

public class Adresse {

	private String mRue;
	private String mVille;
	private String mCodePostal;

	public Adresse(String rue, String ville, String cp) {
		this.mRue = rue;
		this.mVille = ville;
		this.mCodePostal = cp;
	}

	public String getCodePostal() {
		return mCodePostal;
	}

	public String getRue() {
		return mRue;
	}

	public String getVille() {
		return mVille;
	}

	@Override
	public String toString() {
		return mRue + " à " + mVille + " (" + mCodePostal + ")";
	}
}
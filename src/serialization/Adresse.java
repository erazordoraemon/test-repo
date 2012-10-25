package serialization;

import java.io.Serializable;

public class Adresse implements Serializable {

	private static final long serialVersionUID = 372335112513713383L;

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
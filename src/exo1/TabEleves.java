package exo1;

public class TabEleves {

	private int mNombreEleves;
	private Eleve[] mEleves;

	public TabEleves() {
		this.mEleves = new Eleve[36];
		this.mNombreEleves = 0;
	}

	public void ajouter(Eleve e) {
		mEleves[mNombreEleves] = e;
		mNombreEleves++;
		trier();
	}

	public int getNombreEleves() {
		return this.mNombreEleves;
	}

	public Eleve rechercher(String nom) {
		for (int i = 0; i < mNombreEleves; i++) {
			if (mEleves[i].getNom().equals(nom)) {
				return mEleves[i];
			}
		}
		return null;
	}

	public void supprimer(int index) {
		if (index < 0 || index >= mNombreEleves) {
			return;
		}

		mEleves[index] = null;
		mNombreEleves--;

		for (int i = index+1; i <= mNombreEleves; i++) {
			mEleves[i-1] = mEleves[i];
		}
	}

	private void trier() {
		for (int i = 1; i < mNombreEleves; i++) {
			if (mEleves[i-1].getNote() > mEleves[i].getNote()) {
				Eleve be = mEleves[i-1];
				Eleve me = mEleves[i];
				mEleves[i-1] = me;
				mEleves[i] = be;
			}
		}
	}

	public Eleve valeur(int index) {
		if (index < 0 || index >= mNombreEleves)
			return null;
		return mEleves[index];
	}
}
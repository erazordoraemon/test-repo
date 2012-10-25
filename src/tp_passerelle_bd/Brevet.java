package tp_passerelle_bd;

import java.util.ArrayList;

public class Brevet {

	private int					mNum;
	private String				mLibelle;
	private String				mTypeCan1;
	private String				mTypeCan2;
	private ArrayList<Pilote>	mPilotes;

	public Brevet(int num, String libelle, String type1, String type2) {
		this.mNum = num;
		this.mLibelle = libelle;
		this.mTypeCan1 = type1;
		this.mTypeCan2 = type2;

		mPilotes = new ArrayList<Pilote>();
	}

	public void ajouterPilote(Pilote p) {
		this.mPilotes.add(p);
	}

	public String getLibelle() {
		return mLibelle;
	}

	public int getNum() {
		return mNum;
	}

	public ArrayList<Pilote> getPilotes() {
		return mPilotes;
	}

	public String getTypeCan1() {
		return mTypeCan1;
	}

	public String getTypeCan2() {
		return mTypeCan2;
	}

	public void setLibelle(String libelle) {
		mLibelle = libelle;
	}

	public void setNum(int num) {
		mNum = num;
	}

	public void setPilotes(ArrayList<Pilote> pilotes) {
		mPilotes = pilotes;
	}

	public void setTypeCan1(String typeCan1) {
		mTypeCan1 = typeCan1;
	}

	public void setTypeCan2(String typeCan2) {
		mTypeCan2 = typeCan2;
	}

	@Override
	public String toString() {
		return "Brevet[" + mNum + " - " + mLibelle + " - " + mTypeCan1 + " - "
				+ mTypeCan2 + "]";
	}
}
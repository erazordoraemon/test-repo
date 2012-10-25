package jdbc.pilotes.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import jdbc.pilotes.Pilote;

public class TableModel	extends
						AbstractTableModel {

	private String[]			mColonnes	= { "idPilote", "NomPilote", "PrenomPilote" };
	private ArrayList<Pilote>	mPilotes;

	public TableModel(ResultSet rs) {
		mPilotes = new ArrayList<Pilote>();
		try {
			while (rs.next()) {
				Pilote p = new Pilote(rs.getInt("NumPilote"), rs.getString("NomPilote"),
										rs.getString("PrenomPilote"));
				mPilotes.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			mPilotes.clear();
		}
	}

	@Override
	public int getColumnCount() {
		return mColonnes.length;
	}

	@Override
	public String getColumnName(int arg0) {
		return mColonnes[arg0];
	}

	@Override
	public int getRowCount() {
		return mPilotes.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		Object o = null;
		Pilote p = mPilotes.get(arg0);

		switch (arg1) {
			case 0:
				o = p.getId();
				break;
			case 1:
				o = p.getNom();
				break;
			case 2:
				o = p.getPrenom();
				break;
		}

		return o;
	}
}
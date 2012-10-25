package tp_passerelle_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Passerelle {

	private static final String	sBd		= "jdbc:postgresql:bd_allonneau";
	private static final String	sMdp	= "lolabc123456";
	private static final String	sUser	= "mallonneau";

	public static ArrayList<Brevet> chargerLesBrevets()	throws SQLException,
														ClassNotFoundException {
		ArrayList<Brevet> listeBrevets = new ArrayList<Brevet>();
		String sql = "SELECT * FROM Brevets";
		Connection c = connexion();
		ResultSet rs = c.createStatement().executeQuery(sql);

		while (rs.next()) {
			Brevet b = new Brevet(rs.getInt(1), rs.getString(2), rs.getString(3),
									rs.getString(4));
			listeBrevets.add(b);
		}
		rs.close();
		c.close();

		return listeBrevets;
	}

	public static ArrayList<Pilote> chargerLesPilotes()	throws SQLException,
														ClassNotFoundException {
		ArrayList<Pilote> listePilotes = new ArrayList<Pilote>();
		String sql = "SELECT * FROM Pilotes";
		Connection c = connexion();
		ResultSet rs = c.createStatement().executeQuery(sql);

		while (rs.next()) {
			String sql2 = "SELECT * FROM Brevets WHERE idBrevet=" + rs.getInt(4);
			ResultSet rs2 = c.createStatement().executeQuery(sql2);
			Brevet b = null;
			if (rs2.first()) {
				b = new Brevet(rs2.getInt(1), rs2.getString(2), rs2.getString(3),
								rs2.getString(4));
			}
			rs2.close();
			Pilote p = new Pilote(rs.getInt(1), rs.getString(2), rs.getString(3), b);
			listePilotes.add(p);
		}
		rs.close();
		c.close();

		return listePilotes;
	}

	private static Connection connexion()	throws SQLException,
											ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(sBd, sUser, sMdp);
	}
}
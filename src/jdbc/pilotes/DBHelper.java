package jdbc.pilotes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	private static final String	sBd		= "jdbc:postgresql:bd_allonneau";
	private static final String	sMdp	= "lolabc123456";
	private static final String	sUser	= "mallonneau";

	private static Connection connection()	throws SQLException,
											ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(sBd, sUser, sMdp);
	}

	public static void insererPilote(final String nom, final String prenom)	throws SQLException,
																			ClassNotFoundException {
		final String query = "INSERT INTO Pilotes (NomPilote, PrenomPilote) " +
				"VALUES ('" + nom + "', '" + prenom + "')";

		final Connection c = connection();
		final Statement s = c.createStatement();
		s.executeUpdate(query);
		c.close();
	}

	public static ResultSet recupereTousPilotes()	throws SQLException,
													ClassNotFoundException {
		final String query = "SELECT * FROM Pilotes";
		final Connection c = connection();
		final Statement s = c.createStatement();
		final ResultSet rs = s.executeQuery(query);
		c.close();

		return rs;
	}
}
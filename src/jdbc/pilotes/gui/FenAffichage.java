package jdbc.pilotes.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jdbc.pilotes.DBHelper;

public class FenAffichage	extends
							JFrame {

	private JTable	mTable;

	public FenAffichage() {
		super("Liste des pilotes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		initContentPane();

		this.setResizable(false);
		this.pack();
		this.setLocation(780, 512);
		this.setVisible(true);
	}

	private void initContentPane() {
		ResultSet rs = null;
		try {
			rs = DBHelper.recupereTousPilotes();
			mTable = new JTable(new TableModel(rs));
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			mTable = new JTable();
		}

		JScrollPane jsp = new JScrollPane(mTable);
		jsp.setPreferredSize(new Dimension(300, 100));

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		container.add(jsp);
	}
}
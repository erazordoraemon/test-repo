package jdbc.pilotes.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jdbc.pilotes.DBHelper;

public class FenInsertion	extends
							JFrame {

	class ValiderListener	implements
							ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nom = mFieldNom.getText();
			String prenom = mFieldPrenom.getText();

			try {
				DBHelper.insererPilote(nom, prenom);
				new FenAffichage();
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane
						.showMessageDialog(	FenInsertion.this,
												"Impossible d'insérer dans la base de données !",
												"Erreur",
												JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private JButton		mBtnValider;
	private JLabel		mLabelNom;

	private JLabel		mLabelPrenom;
	private JTextField	mFieldNom;

	private JTextField	mFieldPrenom;

	public FenInsertion() {
		super("Insérer un pilote");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// this.setSize(250, 125);

		this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		initContentPane();

		this.setResizable(false);
		this.pack();
		this.setLocation(320, 512);
		this.setVisible(true);
	}

	private void initContentPane() {
		mBtnValider = new JButton("Valider");
		mLabelNom = new JLabel("Nom :");
		mLabelPrenom = new JLabel("Prénom :");
		mFieldNom = new JTextField();
		mFieldPrenom = new JTextField();

		mFieldNom.setPreferredSize(new Dimension(100, 25));
		mFieldPrenom.setPreferredSize(new Dimension(100, 25));
		mBtnValider.addActionListener(new ValiderListener());

		JPanel insertPan = new JPanel();
		insertPan.setBorder(BorderFactory
				.createTitledBorder("Insérer un pilote dans la BD"));
		insertPan.setLayout(new GridLayout(2, 2));
		insertPan.add(mLabelNom);
		insertPan.add(mFieldNom);
		insertPan.add(mLabelPrenom);
		insertPan.add(mFieldPrenom);

		JPanel container = new JPanel(new BorderLayout());
		container.add(insertPan, BorderLayout.CENTER);
		container.add(mBtnValider, BorderLayout.SOUTH);

		this.getContentPane().add(container);
	}
}
package tp_passerelle_bd;

import java.awt.Container;

import javax.swing.JFrame;

public class Fenetre extends
					JFrame {

	public Fenetre() {
		super("Fenêtre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);

		initContentPane();

		setVisible(true);
	}

	private void initContentPane() {
		Container container = getContentPane();
	}
}
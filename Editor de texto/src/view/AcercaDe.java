package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AcercaDe extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void abrir() {
		try {
			AcercaDe dialog = new AcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDe() {
		setTitle("Acerca de");
		setBounds(100, 100, 278, 183);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel txt1 = new JLabel("Editor de texto");
		txt1.setBounds(101, 29, 102, 14);
		contentPanel.add(txt1);
		
		JLabel txt2 = new JLabel("Versión 1.0");
		txt2.setBounds(101, 68, 102, 14);
		contentPanel.add(txt2);
		
		JLabel txt3 = new JLabel("Autor: Alejandro Cañete Hajiphylakti");
		txt3.setBounds(70, 108, 182, 14);
		contentPanel.add(txt3);
		
		JLabel lblFoto = new JLabel(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Editor de texto\\src\\fotos\\foto.jpg"));
		lblFoto.setBounds(10, 11, 71, 68);
		contentPanel.add(lblFoto);
	}

}

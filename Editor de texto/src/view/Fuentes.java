package view;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Fuentes extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Fuentes dialog = new Fuentes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Fuentes() {
		setBounds(100, 100, 305, 304);
		getContentPane().setLayout(null);
		
		JLabel lblFuente = new JLabel("Fuente");
		lblFuente.setBounds(30, 11, 46, 14);
		getContentPane().add(lblFuente);
		
		JLabel lbltamanio = new JLabel("Tama\u00F1o");
		lbltamanio.setBounds(117, 11, 46, 14);
		getContentPane().add(lbltamanio);
		
		JLabel lblEstilo = new JLabel("Estilo");
		lblEstilo.setBounds(214, 11, 46, 14);
		getContentPane().add(lblEstilo);
		
		List list = new List();
		list.setBounds(23, 50, 64, 101);
		getContentPane().add(list);
		
		List list_1 = new List();
		list_1.setBounds(117, 50, 46, 101);
		getContentPane().add(list_1);
		
		JPanel pEstilo = new JPanel();
		CheckboxGroup grpEstilo = new CheckboxGroup();
		pEstilo.setLayout(null);
		
		Checkbox opcNormal = new Checkbox("Normal", true, grpEstilo);
		opcNormal.setBounds(0, 0, 52, 22);
		pEstilo.add(opcNormal);
		Checkbox opcNegrita = new Checkbox("Negrita", true, grpEstilo);
		opcNegrita.setBounds(-1, 40, 53, 22);
		pEstilo.add(opcNegrita);
		Checkbox opcCursiva = new Checkbox("Cursiva", true, grpEstilo);
		opcCursiva.setBounds(0, 78, 56, 22);
		pEstilo.add(opcCursiva);
		getContentPane().add(pEstilo);
		pEstilo.setBounds(195,51,64,100);
		
		JLabel lblPrueba = new JLabel("Texto de prueba");
		lblPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrueba.setBounds(55, 163, 171, 52);
		getContentPane().add(lblPrueba);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(38, 226, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(171, 226, 89, 23);
		getContentPane().add(btnNewButton_1);
		

	}
}

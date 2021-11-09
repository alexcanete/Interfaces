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
		setBounds(100, 100, 335, 242);
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
		
		Checkbox opcNormal = new Checkbox("Normal", true, grpEstilo);
		Checkbox opcNegrita = new Checkbox("Negrita", true, grpEstilo);
		Checkbox opcCursiva = new Checkbox("Cursiva", true, grpEstilo);
		
		pEstilo.add(opcNormal);
		pEstilo.add(opcNegrita);
		pEstilo.add(opcCursiva);
		add(pEstilo);
		pEstilo.setBounds(200,100,200,100);
		

	}
}

package view;

import java.awt.BorderLayout;
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(117, 11, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(214, 11, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		List list = new List();
		list.setBounds(23, 50, 64, 101);
		getContentPane().add(list);
		
		List list_1 = new List();
		list_1.setBounds(117, 50, 46, 101);
		getContentPane().add(list_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		rdbtnmntmNewRadioItem.setBounds(176, 36, 133, 115);
		getContentPane().add(rdbtnmntmNewRadioItem);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
	}
}

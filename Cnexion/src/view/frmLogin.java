package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	
	
	public static void abrirLogin(){
		frmLogin frame = new frmLogin();
		frame.setVisible(true);
	}
	


	public frmLogin() {
		setBounds(100, 100, 231, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(74, 120, 77, 15);
			contentPanel.add(btnAceptar);
		}
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(24, 36, 77, 14);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
			lblContrasenia.setBounds(24, 61, 77, 14);
			contentPanel.add(lblContrasenia);
		}
		{
			textField = new JTextField();
			textField.setBounds(111, 35, 77, 15);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(111, 60, 77, 15);
			contentPanel.add(textField_1);
		}
	}

}

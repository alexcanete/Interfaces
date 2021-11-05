package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class frmTest extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void abrirTest(){
		frmTest frame = new frmTest();
		frame.setVisible(true);
	}

	
	public frmTest() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 174, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMensaje = new JLabel("New label");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMensaje, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnAceptar = new JButton("Aceptar");
		panel.add(btnAceptar);

		btnAceptar.addActionListener(l -> {
			System.exit(0);
		});
	}

}

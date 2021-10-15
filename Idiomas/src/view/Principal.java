package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	
	public static JLabel lPalabra = new JLabel("");

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane dtrpnEscribeLaTraduccion = new JEditorPane();
		dtrpnEscribeLaTraduccion.setBounds(54, 138, 141, 20);
		contentPane.add(dtrpnEscribeLaTraduccion);
		
		
		
		
		lPalabra.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lPalabra.setBounds(106, 29, 219, 70);
		contentPane.add(lPalabra);
		
		
		
		
		JLabel lCorrecto = new JLabel("");
		
		lCorrecto.setHorizontalAlignment(SwingConstants.CENTER);
		lCorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lCorrecto.setBounds(153, 202, 123, 36);
		contentPane.add(lCorrecto);
			
		setVisible(true);
		
		JButton btnConfirmar = new JButton("✓");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean funciona = controller.Controlador.verificar();
				if(funciona== true) {
					lCorrecto.setText("CORRECTO!!");
				}else {
					lCorrecto.setText("INCORRECTO!!");

				}
			}
		});
		btnConfirmar.setIcon(null);
		btnConfirmar.setBounds(255, 138, 89, 23);
		contentPane.add(btnConfirmar);

			
		}
	
}
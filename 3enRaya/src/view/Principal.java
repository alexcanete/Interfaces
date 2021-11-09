package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton = new JButton("");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblJugador = new JLabel("Jugador: ");
		panel_1.add(lblJugador);
		
		JLabel lblNombre = new JLabel("----");
		panel_1.add(lblNombre);
	}
}

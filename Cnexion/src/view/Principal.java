package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDataBase = new JMenu("DataBase");
		menuBar.add(mnDataBase);
		
		JMenuItem mntmConex = new JMenuItem("Conexi\u00F3n");
		mnDataBase.add(mntmConex);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnDataBase.add(mntmLogin);
		
		JSeparator separator = new JSeparator();
		mnDataBase.add(separator);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mnDataBase.add(mntmTest);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		mntmConex.addActionListener(e -> {
			Conexion.abrirConexion();

		});

		mntmLogin.addActionListener(e -> {
			frmLogin.abrirLogin();
		});
		
		mntmTest.addActionListener(l -> {
			controller.Controlador.testCon();
			frmTest.abrirTest();
		});
		
			
			
	}

	


}

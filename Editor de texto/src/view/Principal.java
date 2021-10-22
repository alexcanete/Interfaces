package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.TextArea;

public class Principal extends JFrame {

	private JPanel contentPane;
	public static TextArea textArea;
	private File actualFile;

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
		setTitle("Editor de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mArchivo = new JMenu("Archivo");
		menuBar.add(mArchivo);
		
		JMenuItem itnNuevo = new JMenuItem("Nuevo");
		mArchivo.add(itnNuevo);
		
		JMenuItem itmAbrir = new JMenuItem("Abrir");
		mArchivo.add(itmAbrir);
		
		JMenuItem itmGuardar = new JMenuItem("Guardar");
		mArchivo.add(itmGuardar);
		
		itmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.Controlador.guardarArchivo(actualFile);;
			}
		});
		
		JMenuItem itmGuardarComo = new JMenuItem("Guardar como");
		mArchivo.add(itmGuardarComo);
		
		JSeparator separator = new JSeparator();
		mArchivo.add(separator);
		
		JMenuItem itmSalir = new JMenuItem("Salir");
		mArchivo.add(itmSalir);
		
		itmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mAyuda = new JMenu("Ayuda");
		menuBar.add(mAyuda);
		
		JMenuItem itmManual = new JMenuItem("Manual");
		mAyuda.add(itmManual);
		
		JMenuItem itmAcercaDe = new JMenuItem("Acerca de");
		mAyuda.add(itmAcercaDe);
		
		JMenu mFormato = new JMenu("Formato");
		menuBar.add(mFormato);
		
		JMenuItem itmFuente = new JMenuItem("Fuente");
		mFormato.add(itmFuente);
		
		JMenuItem itmColores = new JMenuItem("Colores");
		mFormato.add(itmColores);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new TextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		
		itmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcercaDe.abrir();
			}
		});
		
		itmManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manual.abriManual();
			}
		});
		
		itmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualFile = controller.Controlador.abrirFichero();
				controller.Controlador.cargarArchivo(actualFile);
			}
		});	
		
	}
}

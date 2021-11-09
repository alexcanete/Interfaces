package unico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class Principal extends JFrame {

	
	int x;
	int y;
	private JPanel contentPane;
	private JLabel lblPerico;

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
		
		x=10;
		y=10;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPerico = new JLabel("PERICO");
		lblPerico.setBounds(177, 112, 56, 25);
		contentPane.add(lblPerico);
		
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				try {
					Clip sonido = AudioSystem.getClip();
					sonido.open(AudioSystem.getAudioInputStream(new File("sonido/muerte.wav")));
					sonido.loop(0);
					sonido.start();
				}catch(Exception ex) {
					
				}
				if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					x+=5;
					
				}else if(e.getKeyCode()== KeyEvent.VK_LEFT ){
					x-=5;

				}else if (e.getKeyCode()== KeyEvent.VK_UP) {
					y-=5;

				}else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
					y+=5;
				}
				lblPerico.setLocation(x,y);
			}	
				
			
		});
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class FrmSalir extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public FrmSalir() {
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				controller.Controlador.salir();
			}
		});
		
		setTitle("SALIR");
		setBounds(100, 100, 333, 161);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSalirPregunta = new JLabel("\u00BFRealmente desea salir?");
			lblSalirPregunta.setBounds(54, 25, 233, 34);
			lblSalirPregunta.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(lblSalirPregunta);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 88, 317, 34);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setBounds(37, 5, 95, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						controller.Controlador.salir();
					}
				});
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBounds(187, 5, 95, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);

				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});

				
				
			}
		}
	}

}

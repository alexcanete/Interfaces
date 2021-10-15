package unico;

public class window extends java.awt.Frame {

	public static void main(String[] args) {
		window miApp = new window();
		miApp.inicializarComponentes();
		System.out.println("ok");
		
	}
	private void inicializarComponentes() {
		setBounds(100, 100, 100, 100);
		setVisible(true);

	}
	
}

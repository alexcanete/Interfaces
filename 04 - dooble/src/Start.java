import view.FrmDoble;

/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Start app = new Start();
		app.init();
		FrmDoble myapp = new FrmDoble();
		myapp.crearVentana();
		
	}
	
	private void init() {
		new view.FrmDoble();
	}

}

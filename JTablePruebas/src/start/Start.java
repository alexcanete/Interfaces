package start;

public class Start {

    public static void main(String[] args) {
		view.FrmPrincipal frame = new view.FrmPrincipal();
        frame.setVisible(true);
        controller.Controlador.rellenarTabla();
	}
}

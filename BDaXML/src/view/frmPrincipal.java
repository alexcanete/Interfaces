package view;
public class frmPrincipal {

	public static void main(String[] args) {
		
		try {

			if (dbms.DataBase.comprobarConexion()== true) {
				System.out.println("Conexion correcta");
			}
			dbms.DataBase.allDBToXML();
				} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

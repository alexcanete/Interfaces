package view;
public class frmPrincipal {

	public static void main(String[] args) {
		
		try {
			dbms.DataBase.conectar();
			if (dbms.DataBase.comprobarConexion()== true) {
				System.out.println("Conexion correcta");
			}
			dbms.DataBase.executeQuery("SELECT * FROM emp");
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}

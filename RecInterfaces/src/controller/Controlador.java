package controller;

import java.sql.Connection;

public class Controlador {
	
	public static void salir() {
		System.exit(0);
	}
	
	public static Connection con;
    public static String mostrar;
    public static void createConexion(){
        String dbHost = view.FrmDataBase.txtHost.getText() + "";
        String dbPuerto = view.FrmDataBase.txtPuerto.getText() + "";
        String dbNombre = view.FrmDataBase.txtNombre.getText() + "";
        model.Conexion.sethost(dbHost);
        model.Conexion.setpuerto(dbPuerto);
        model.Conexion.setBaseDatos(dbNombre);
        

    }
    public static void createLogin() throws Exception{
        String dbUsuario = view.FrmLogin.txtUsuario.getText() + "";
        String dbcontrasena = view.FrmLogin.txtContrasenia.getText() + "";
        model.Conexion.setUsuario(dbUsuario);
        model.Conexion.setcontrasena(dbcontrasena);

    }
    
}

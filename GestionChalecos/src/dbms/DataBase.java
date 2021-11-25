package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	public static Connection con= controller.Controlador.con;
    //conectar a db
    public static void conectar(){
		
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@" + model.Conexion.host  + ":" + model.Conexion.puerto + "/" + model.Conexion.baseDatos, model.Conexion.Usuario, model.Conexion.contrasena);
            System.out.println(con);
            Statement st = ((Connection) con).createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
        try {
            controller.Controlador.executeQuery("SELECT * FROM CHALECO");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //cerrar db
    public static void desconectar() throws Exception{
		if(con.isClosed()==true){
            System.out.println("Conexion cerrada");
        }else{
            con.close();
            System.out.println("Conexion cerrada");
        }
        
	}


    //metodo comprobar conexion
    public static boolean comprobarConexion(){
        try {
            conectar();
            desconectar();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    
    
    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection con) {
        DataBase.con = con;
    }


}
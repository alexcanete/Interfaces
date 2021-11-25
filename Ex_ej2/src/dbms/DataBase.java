package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataBase {

    public static Connection con= controller.Controlador.con;

    public static void conectar() throws Exception {
		
		String dbHOST = "10.192.120.60";
		String dbPORT = "1521";
		String dbNAME = "orcl";
		String dbUSER = "ALEX";
		String dbPASS = "5720";
		
		
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+":"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		con = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
		
	}
    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection con) {
        DataBase.con = con;
    }
}

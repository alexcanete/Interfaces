package dbms;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	public static Connection conn;

	
	public static void conectarCasa() throws Exception {
		
		String dbHOST = "localhost";
		String dbPORT = "1521";
		String dbNAME = "xepdb1";
		String dbUSER = "System";
		String dbPASS = "5720";
		
		
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+"/"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);

		System.out.println(conn);
	  }
	  
	public static void conectarClase() throws Exception {

			
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
			
			conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
	    }

	public static void executeQuery(){

		try {
			conn.createStatement().executeQuery("SELECT * FROM DEFUNCIONES");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

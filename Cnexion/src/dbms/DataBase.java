package dbms;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataBase {

    private static Connection conn;
	public static String dbHOST;
	public static String dbPORT;
	public static String dbNAME;
	public static String dbUSER;
	public static String dbPASS;


    public static Connection getConn(){
		return conn;
	}

    public static void desconectar() throws Exception{
		conn.close();
	}

    public static void conectar() throws Exception {
		/*
		String dbHOST = "10.192.120.60";
		String dbPORT = "1521";
		String dbNAME = "orcl";
		String dbUSER = "ALEX";
		String dbPASS = "5720";
		*/
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+":"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
	}
}

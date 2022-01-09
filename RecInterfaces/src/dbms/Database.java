package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Database {
	
	  public static Connection conn;
	  public static String mostrar;
	
	//conectar a db de la clase****
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
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
    }

    //conectar a base de datos de mi casa****
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
        dbms.Database.executeQuery("select * from ordenadores");

    }

    //cerrar db
    public static void desconectar() throws Exception{
		if(conn.isClosed()==true){
        }else{
            conn.close();
        }
        
	}


    //metodo comprobar conexion
    public static boolean comprobarConexion(){
        try {
            conectarCasa();
            desconectar();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    
    
    public static Connection getConn() {
        return conn;
    }
    public static void setCon(Connection conn) {
    	Database.conn = conn;
    }   
    

    public static String executeQuery(String Query) throws Exception{

        conectarCasa();
            //mandar query a la base de datos
        Statement miOrden = dbms.Database.getConn().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();

        ResultSetMetaData info = resultado.getMetaData();
        mostrar = "";

        // obtener la tabla y guardar en mostrar
        int numCampos = info.getColumnCount();
        for(int iContador = 1; iContador <= numCampos; iContador++) {


            mostrar+=(info.getColumnName(iContador) + "    "); 
        }
            mostrar+="\n";
            while(resultado.next()) {

      
                for(int iContador = 1; iContador <= numCampos; iContador++) {
                mostrar+= (resultado.getString(iContador) + "    "); 
                }
                mostrar+="\n";

            }

            
    return mostrar;
    
    }
}

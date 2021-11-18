package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBase {
    public static Connection conn;
    public static String mostrar;



    //conectar a db
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

    public static void conectarCasa() throws Exception {
		
		String dbHOST = "localhost";
		String dbPORT = "1521";
		String dbNAME = "xe";
		String dbUSER = "System";
		String dbPASS = "5720";
		
		
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+":"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
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
        DataBase.conn = conn;
    }   
    

    public static void executeQuery(String Query) throws Exception{

        conectarCasa();
            //mandar query a la base de datos
        Statement miOrden = dbms.DataBase.getConn().createStatement();
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
            System.out.println(mostrar);
    
    }
}

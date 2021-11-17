package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBase {
    public static Connection conn;
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
            conectar();
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
    


    public static void executeQuery(String Query) throws SQLException{
    
            //mandar query a la base de datos
        Statement miOrden = dbms.DataBase.getConn().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();

        ResultSetMetaData info = resultado.getMetaData();

        //guardar en mostrar
        int numCol = info.getColumnCount();
        String[] mostrar = new String[numCol];
        for (int i = 0; i < numCol; i++) {
            mostrar[i] = info.getColumnName(i + 1);
        }
        System.out.println(mostrar);

    } 
   
}

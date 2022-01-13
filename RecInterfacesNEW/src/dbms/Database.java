package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import logic.Logic;

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
            conectar2();
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
    

    public static void executeQuery(String Query) throws Exception{

        // conectar();
        DefaultTableModel modelo = new DefaultTableModel();
        model.Conexion.setQuery(Query);

    
            //mandar query a la base de datos
        Statement miOrden = Database.getConn().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();

        ResultSetMetaData info = resultado.getMetaData();

        // obtener la tabla y guardar en mostrar
        int numCampos = info.getColumnCount();
        for(int iContador = 1; iContador <= numCampos; iContador++) {
            modelo.addColumn(info.getColumnName(iContador)); 
        }
        String row[] = new String[numCampos];
            while(resultado.next()) {
                for(int iContador = 1; iContador <= numCampos; iContador++) {
                    row[iContador-1] = resultado.getString(iContador);
                }
                modelo.addRow(row); 
            }
            view.FrmPrincipal.table.setModel(modelo);

    }

    public static String cargarId() throws SQLException{

        String sMarca = view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 0).toString();
        String sModelo = view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 1).toString();
        String sProveedor = view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 2).toString();
        String sMicro = view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 3).toString();
        String sRam = view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 4).toString();

        String sId= executeQuery2("SELECT ID FROM ORDENADORES WHERE MARCA = '"+sMarca+"' AND MODELO = '"+sModelo+"' AND PROVEEDOR = '"+sProveedor+"' AND MICRO = '"+sMicro+"' AND RAM = '"+sRam+"'");
        return sId;
    }

    private static String executeQuery2(String Query) throws SQLException {
        model.Conexion.setQuery(Query);

    
            //mandar query a la base de datos
        Statement miOrden = Database.getConn().createStatement();
        miOrden.execute(Query);

        ResultSet resultado = miOrden.getResultSet();
        Logic.getAllPc();

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
        return mostrar;


    }

    public static void conectar2(){
		
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + model.Conexion.host  + ":" + model.Conexion.puerto + "/" + model.Conexion.baseDatos, model.Conexion.Usuario, model.Conexion.contrasena);
            System.out.println(conn);
            Statement st = ((Connection) conn).createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
    }
}

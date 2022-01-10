package dbms;

import java.io.File; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



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
		
		String dbHOST = "-";
		String dbPORT = "3306";
		String dbNAME = "337965";
		String dbUSER = "337965";
		String dbPASS = "337965";
		
		
		String dbURL = "jdbc:oracle:thin:@"+dbHOST+":"+dbPORT+":"+dbNAME;
		System.out.println(dbURL);
		
		//Cargar el driver de memoria
		
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();	
		//Establecer conexiones
		
		conn = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
    }

    public static void conectarCasa2() throws Exception {
		
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
    

    public static String executeQuery(String Query) throws Exception{

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
    return mostrar;
    
    }


    public static void dbToXml(String tableName, String fileName) throws Exception{
    

        Connection conn = dbms.DataBase.getConn();
        String query = "SELECT * FROM "+ tableName;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement(tableName);
        rootElement.appendChild(doc.createTextNode(tableName));
        doc.appendChild(rootElement);
        rootElement.appendChild(doc.createTextNode("\n"));

        while(rs.next()){
            for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                Element column = doc.createElement(rs.getMetaData().getColumnName(i));
                column.appendChild(doc.createTextNode(rs.getString(i)));
                rootElement.appendChild(column);
                rootElement.appendChild(doc.createTextNode("\n"));


            }
            rootElement.appendChild(doc.createTextNode("\n"));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(fileName));
        transformer.transform(source, result);

        }
    
    }
    //obtener nombre tablas
    public static void allDBToXML() throws Exception{
        conectarCasa();
        System.out.println("llega");
        Statement miOrden = dbms.DataBase.getConn().createStatement();
        String query = "SELECT table_name FROM user_tables";
        ResultSet resultado = miOrden.executeQuery(query);
        while(resultado.next()){
            dbToXml(resultado.getString(1), resultado.getString(1)+".xml");
        }
        desconectar();
    }
}

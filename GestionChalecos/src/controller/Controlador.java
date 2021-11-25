package controller;

import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Controlador {
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
    public static void createLogin(){
        String dbUsuario = view.FrmLogin.txtUsuario.getText() + "";
        String dbcontrasena = view.FrmLogin.txtContrasenia.getText() + "";
        model.Conexion.setUsuario(dbUsuario);
        model.Conexion.setcontrasena(dbcontrasena);
        dbms.DataBase.conectar();


    }



    


    public static void executeQuery(String Query) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
    
            //mandar query a la base de datos
        Statement miOrden = dbms.DataBase.getCon().createStatement();
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
    public static void nuevoChaleco() {

        String sModelo = view.FrmNuevoChaleco.txtModelo.getText() + "";
        int iColor = 1;
        int iTalla = 1;
        String sPrecio = view.FrmNuevoChaleco.txtPrecio.getText() + "";
        String sStock = view.FrmNuevoChaleco.txtStock.getText() + "";

        String Query = "INSERT INTO CHALECO (id_chaleco,MODELO,COLOR,TALLA,PRECIO,STOCK) VALUES (seq_chaleco.nextval,'" + sModelo + "'," + iColor + "," + iTalla + "," + sPrecio + "," + sStock + ")";
        
        try {
            executeQuery(Query);
            executeQuery("COMMIT");
        


            

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
          
            


        	
}


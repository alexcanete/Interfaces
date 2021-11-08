package controller;
import java.sql.Connection;
import java.sql.DriverManager;

import model.Conexion;
public class Controlador {

    public static Object con;
    public static void createConexion(){
        String dbHost = view.Conexion.txtHost.getText() + "";
        String dbPuerto = view.Conexion.txtPuerto.getText() + "";
        String dbNombre = view.Conexion.txtNombre.getText() + "";
        model.Conexion.sethost(dbHost);
        model.Conexion.setpuerto(dbPuerto);
        model.Conexion.setBaseDatos(dbNombre);
    }
    public void createLogin(){
        String dbUsuario = view.frmLogin.txtUsuario.getText() + "";
        String dbcontrasena = view.frmLogin.txtContrasenia.getText() + "";
        model.Conexion.setUsuario(dbUsuario);
        model.Conexion.setcontrasena(dbcontrasena);


    }

    //conectar a db
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Object con = DriverManager.getConnection("jdbc:mysql://" + Conexion.host + ":" + Conexion.Puerto + "/" + Conexion.baseDatos, Conexion.Usuario, Conexion.contrasena);
            Object st = ((Connection) con).createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
    }
    //cerrar db
    public void cerrar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + Conexion.host + ":" + Conexion.Puerto + "/" + Conexion.baseDatos, Conexion.Usuario, Conexion.contrasena);
            Object st = ((Connection) con).createStatement();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println("Error al cerrar");
        }
    }

    //metodo comprobar conexion
    public static void testCon(){
        if (con == null) {
            view.frmTest.mensaje= "No hay conexion";
        } else {
            view.frmTest.mensaje= "Si hay conexion";
        }
    }

    
}

package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Datos;

public class Controlador {

    public static void crearFichero() throws IOException{
        File f = new File("datos.txt") ;
       
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Datos(15325115, "Alex", "Garcia"));
        oos.writeObject(new Datos(45226245, "Pepe", "fernandez"));
        oos.writeObject(new Datos(45226245, "Juan", "Garcia"));
        oos.writeObject(new Datos(45226245, "Maria", "Garcia"));
        oos.writeObject(new Datos(45226245, "Jose", "Garcia"));
        oos.writeObject(new Datos(45226245, "Ana", "Garcia"));
        oos.writeObject(new Datos(45226245, "Luis", "Garcia"));

        oos.close();
        fos.close();
          
    }

    //leer fichero
    public static void leerFichero() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f = new File("datos.txt") ;
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Datos d = (Datos) ois.readObject();
        System.out.println(d);
        ois.close();
        fis.close();
    }

}

package ej4;

public class ej4 {
    public static void main(String[] args){

        final int tiempoSleepEs= 1000; //1 segundo
        final int tiempoSleepC= 1500; //1.5 segundo


        //creamos la mesa
        Buffer mesa = new Buffer();

        //crear Cliente
        Estudiante estudiante = new Estudiante(mesa, tiempoSleepEs); //estudiante1
    

        //crear cajera
        Cocinero cocinero = new Cocinero(mesa, tiempoSleepC); 

   
        //empezar a trabajar
        cocinero.start();
        estudiante.start();

    }
}

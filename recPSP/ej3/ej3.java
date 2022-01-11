package ej3;

public class ej3 {
    public static void main(String[] args){

        final int tiempoSleep= 1000; //1 segundo



        Buffer mesa = new Buffer();

        //crear Cliente
        Estudiante estudiante = new Estudiante(mesa, tiempoSleep); //estudiante1
    

        //crear cajera
        Cocinero cocinero = new Cocinero(mesa, tiempoSleep); 

   
        //empezar a trabajar
        cocinero.start();
        estudiante.start();

    }
}

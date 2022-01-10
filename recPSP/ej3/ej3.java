package ej3;

public class ej3 {
    final int tiempoSleep= 1000; //1 segundo

    final int[] objetosLista = {1,4,9}; //lista de objetos
    final int[] objetosLista1 = {3,9,2}; 
    final int[] objetosLista2 = {1,6,7};

    //crear Cliente
    Estudiante estudiante1 = new Estudiante(objetosLista,tiempoSleep); //estudiante1
    Estudiante estudiante2 = new Estudiante(objetosLista1,tiempoSleep); //estudiante2
    Estudiante estudiante3 = new Estudiante(objetosLista2,tiempoSleep); //estudiante3

    //crear cajera
    Cocinero cocinero1 = new Cocinero(estudiante1, tiempoSleep); 
    Cocinero cocinero2 = new Cocinero(estudiante2, tiempoSleep); 
    Cocinero cocinero3 = new Cocinero(estudiante3, tiempoSleep); 
   
    //empezar a trabajar
    cocinero1.start();
}

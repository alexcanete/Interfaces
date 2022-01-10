package ej1;
public class ej1 {
    public static void main(String[] args) {
       
        //tiempo de sueño
        final int tiempoSleep= 1000; //1 segundo

        final int[] objetosLista = {1,4,9}; //lista de objetos
        final int[] objetosLista1 = {3,9,2}; 
        final int[] objetosLista2 = {1,6,7};

        //crear Cliente
        Cliente cliente1 = new Cliente("Pablo",objetosLista,tiempoSleep); //cliente1
        Cliente cliente2 = new Cliente("Juande",objetosLista1,tiempoSleep); //cliente2
        Cliente cliente3 = new Cliente("Raul",objetosLista2,tiempoSleep); //cliente3

        //crear cajera
        Cajera cajera1 = new Cajera("Manuelita",cliente1, tiempoSleep); //cajera1
        Cajera cajera2 = new Cajera("Juanita",cliente2, tiempoSleep);  //cajera2
        Cajera cajera3 = new Cajera("Maria",cliente3, tiempoSleep); //cajera3

        //empezar a trabajar
        cajera1.start();
        cajera2.start();
        cajera3.start();
        
    }
}

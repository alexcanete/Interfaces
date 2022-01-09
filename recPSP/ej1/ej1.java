package ej1;
public class ej1 {
    public static void main(String[] args) {
       
        final int tiempoSleep= 1000;
        final int[] objetosLista = {1,4,9}; 
        final int[] objetosLista1 = {3,9,2};
        final int[] objetosLista2 = {1,6,7};

        //crear Cliente
        Cliente cliente1 = new Cliente("Pepe",objetosLista,tiempoSleep);
        Cliente cliente2 = new Cliente("Juan",objetosLista1,tiempoSleep);
        Cliente cliente3 = new Cliente("Maria",objetosLista2,tiempoSleep);

        Cajera cajera1 = new Cajera("manola",cliente1, tiempoSleep);
        Cajera cajera2 = new Cajera("juanita",cliente2, tiempoSleep);
        Cajera cajera3 = new Cajera("carmen",cliente3, tiempoSleep);

        cajera1.start();
        cajera2.start();
        cajera3.start();
        
    }
}

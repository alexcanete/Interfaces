package ej4;

public class Buffer {
    
    private int contenido;
    private boolean disponible = false;

    //coge la bandeja
    public synchronized int get() {

        // si la mesa no esta disponible entra 
        while (disponible == false) { // mientras la mesa esta ocupuda espera
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
        disponible = false; //si llega aqí es porque la mesa esta disponible y la pone ocupada
        notify(); //notifica a los estudiantes que pueden coger la bandeja
        return contenido; //devuelve contenido de la mesa
    }


    //pone la bandeja 
    public synchronized void put(int value) {

        while (disponible == true) {// mientras la mesa esta disponible espera
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        contenido= value; //pone el valor en la mesa
        disponible = true; //pone la mesa como disponible
        notify(); //notifica a los hilos que estan esperando
    }
    
}

package ej4;

public class Buffer {
    
    private int contenido;
    private boolean disponible = false;

    public synchronized int get() {
        while (!disponible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
        disponible = false;
        notify();
        return contenido;
    }

    public synchronized void put(int value) {

        while (disponible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        contenido= value;
        disponible = true;
        notify();
    }
    
}

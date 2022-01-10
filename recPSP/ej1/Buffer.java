package ej1;

public class Buffer {
    
    private int contenido;
    private boolean disponible= false;


    //
    public synchronized int get() { //get
        while(disponible== false){
            try{
                wait(); //espera
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        disponible= false;
        notify(); //notifica a los hilos que estan esperando
        return contenido;
    }

    public synchronized void put(int value) { //put
        while(disponible== true){//si esta disponible es false
            try{
                wait(); //espera
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        contenido= value;
        disponible= true;
        notify(); //notifica a los que estan esperando
    }
}

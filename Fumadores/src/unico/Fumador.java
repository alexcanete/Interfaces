package unico;

import java.util.Random;

public class Fumador extends Thread{

    private Random r = new Random();

    private int id;
    private Mesa mesa;
    public Fumador(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
    }

    public void run() {
        while (true) {
            try {
                mesa.quieroFumar(id);
                Thread.sleep(r.nextInt(300));
                mesa.finFumar(id);
                Thread.sleep(r.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }

    
}


package unico;

import java.util.Random;

public class Estanquero extends Thread {

    private Random r = new Random();
    private Mesa mesa;

    public Estanquero(Mesa mesa) {
        this.mesa = mesa;
    }

    public void run () {
        while (true) {
            int ingr = r.nextInt(3);
            try {
                Thread.sleep(r.nextInt(300));
                mesa.nuevosIngredientes(ingr);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}

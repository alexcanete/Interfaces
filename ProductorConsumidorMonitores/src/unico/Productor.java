package unico;

public class Productor extends Thread {
    private Buffer almacen;
    private int dormir;
    
    public Productor(Buffer almacen, int numero) {
        this.almacen = almacen;
        this.dormir = numero;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            
            almacen.put(i);
            System.out.println("Productor pone el elemento: " + i + " en el almacen");
            try {
                sleep(dormir);
            } catch (InterruptedException e) {
                System.err.println("Error en el productor");
                e.printStackTrace();
            }
           
        }
    }

}

package unico;

public class Mesa {

    private boolean ingrEnMesa = false;
    private boolean fumando = false;
    private int ingr;

    public synchronized void nuevosIngredientes (int ingr) throws InterruptedException {
       
        while (ingrEnMesa || fumando) {            
            wait();
            this.ingr= ingr;
            ingrEnMesa = true;
            System.out.println("El estanquero no pone el ingrediente: "+ingr);
            notifyAll();
        }
    }
    public synchronized void quieroFumar (int id) throws InterruptedException {
        while (!ingrEnMesa || fumando || ingr!=id) {
            wait();
            System.out.println("Fumador " + id + " empieza a fumar");
            ingrEnMesa = false;
            fumando = true;
        }
        
    }
    public synchronized void finFumar (int id) {
        fumando = false;
        System.out.println("Fumador " + id + " termina de fumar");
        notifyAll();
    }
}

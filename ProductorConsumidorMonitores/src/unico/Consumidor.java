package unico;

public class Consumidor extends Thread{

    private Buffer almacen;
    private int dormir;
    
    public Consumidor(Buffer almacen, int dormir){
        this.almacen = almacen;
        this.dormir = dormir;
    }

    public void run(){
        int valor =0;
        for (int i=0; i<10; i++){
            valor = almacen.get();
            System.out.println("El consumidor saca el elemento: " + valor + " del almacen");
            try{
                sleep(dormir);
            }catch(InterruptedException e){
                System.err.println("Error en Conumidor");
            }

        }
    }
}
    

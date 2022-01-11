package ej4;
public class Cocinero extends Thread{
    private Buffer mesa;
    private int dormir;
    
    public Cocinero(Buffer mesa, int numero) {
        this.mesa = mesa;
        this.dormir = numero;
    }

    public void run(){
        for (int i = 1; i < 30; i++) {            
            mesa.put(i);
            System.out.println("Cocinero pone bandeja sobre la mesa");
            try{
                sleep(dormir);
            }catch(InterruptedException e){
                System.err.println("Error en Cocinero");
                e.printStackTrace();
            }
           
        }
    }
}


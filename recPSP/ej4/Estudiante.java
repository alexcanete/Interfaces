package ej4;
public class Estudiante extends Thread{
    private Buffer mesa;
    private int dormir;
    
    public Estudiante(Buffer mesa, int dormir){
        this.mesa = mesa;
        this.dormir = dormir;
    }

    public void run(){
        int valor =0;
        for (int i=1; i<30; i++){
            
            try{
                valor = mesa.get(); //coge la bandeja de la mesa
                System.out.println("Estudiante: " + valor + " coge la bandeja de la mesa");
                sleep(dormir); //duerme 
            }catch(InterruptedException e){
                System.err.println("Error en Estudiante");
            }

        }
    }  

   
    
}

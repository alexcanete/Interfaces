package unico;

public class Cajera extends Thread{
    
    private Buffer almacen;
    private int dormir;

    //contructor
    public Cajera(unico.Buffer almacen, int dormir) {
        this.almacen = almacen;
        this.dormir = dormir;
    }

    public void run(){
        int valor = 0;

       for(int i=0;i<10;i++){
    	   almacen.put(i);
               System.out.println("Cajera pone: "+ i );
    	   
           try{
               
               	sleep(dormir);
           }catch(InterruptedException e){
               System.out.println("Error en la cajera");
           }
       }
    }

    	



}

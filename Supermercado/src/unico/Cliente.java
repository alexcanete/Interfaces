package unico;

import java.nio.Buffer;

public class Cliente extends Thread{

    private unico.Buffer almacen;
    private int dormir;

    public Cliente(unico.Buffer almacen, int dormir){
        this.almacen = almacen;
        this.dormir = dormir;
    }

    public void run(){
       int valor = 0;
       for (int i = 0; i < 10; i++){
           valor = almacen.get();
           System.out.println("Cliente saca: " + valor);
           try{
              sleep(dormir);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}
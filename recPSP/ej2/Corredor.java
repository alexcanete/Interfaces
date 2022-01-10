package ej2;

public class Corredor extends Thread{
    private String sNombre;
    private int iDormir;
    private int iKm;

    //constructor
    public Corredor(String sNombre, int iDormir, int iKm) {
        setsNombre(sNombre);
        setiDormir(iDormir);
        setiKm(iKm);
                
        
    }

    

    public void run() {
        System.out.println("Corredor " + sNombre + " comienza a correr"); //empezar a correr
        for (int i = 0; i < 10; i++) {
            System.out.println("Corredor " + sNombre + " corre " + i + " km"); //se mueve 1km por cada iteracion	

        try {
            Thread.sleep(iDormir); //duerme
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        }
        System.out.println("------------- El corredor " + sNombre + " llegó a la meta -------------"); //llega a la meta
    }

    //getters y setters
    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiDormir() {
        return iDormir;
    }

    public void setiDormir(int iDormir) {
        this.iDormir = iDormir;
    }

    public int getiKm() {
        return iKm;
    }   

    public void setiKm(int iKm) {
        this.iKm = iKm;
    }
    

    
}   

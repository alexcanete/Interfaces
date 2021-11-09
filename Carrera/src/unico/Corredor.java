package unico;

public class Corredor extends Thread{
    private String sNombre;
    private int iDormir;
    private int iKm;

    public Corredor(String sNombre, int iDormir, int iKm) {
        setsNombre(sNombre);
        setiDormir(iDormir);
        setiKm(iKm);
                
        
    }

    //run
    @Override
    public void run() {
        System.out.println("Corredor " + sNombre + " comienza a correr");
        for (int i = 0; i < 10; i++) {
            System.out.println("Corredor " + sNombre + " corre " + i + " km");

        try {
            Thread.sleep(iDormir);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        }
        System.out.println("------------- Corredor " + sNombre + " termina de correr -------------");
        
    }


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

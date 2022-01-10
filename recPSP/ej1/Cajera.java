package ej1;

public class Cajera extends Thread{
    private String sNombre;
    private Cliente clien;
    private int dormir;

    //contructor
    public Cajera(String sNombre,Cliente clien, int dormir) {
        setsNombre(sNombre);
        setClien(clien);
        setDormir(dormir);
    }

    @Override
    public void run() {
        int iSuma=0;
       for (int i = 0; i < clien.getiCompra().length; i++) {
        System.out.println("La cajera "+getsNombre()+" ha pasado el producto "+i+" del cliente "+clien.getsNombre()+
        " y ha tardado "+clien.getiCompra()[i]);
        iSuma+=clien.getiCompra()[i];
        try {
            Thread.sleep(this.dormir);
        } catch (InterruptedException ex) {
            System.out.println("Error en la cajera");
        }
       } 
       System.out.println("La cajera "+getsNombre()+" ha pasado la compra del cliente "+clien.getsNombre()+
       " y ha tardado "+iSuma+" segundos en total");          

    }

    public Cliente getClien() {
        return clien;
    }

    public void setClien(Cliente clien) {
        this.clien = clien;
    }

    public int getDormir() {
        return dormir;
    }

    public void setDormir(int dormir) {
        this.dormir = dormir;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
}

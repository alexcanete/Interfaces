package ej1;

public class Cliente {
    private String sNombre;
    private int[] iCompra;
    private int dormir;

    //constructor
    public Cliente(String sNombre,int[] iCompra , int dormir){
        setsNombre(sNombre);
        setiCompra(iCompra);
        setDormir(dormir);
    }

    //getter y setters
    public int getDormir() {
        return dormir;
    }

    public void setDormir(int dormir) {
        this.dormir = dormir;
    }

    //getiCompra
    public int[] getiCompra(){
        return iCompra;
    }
   
    public void setiCompra(int[] iCompra){
        this.iCompra = iCompra;
    }


    public String getsNombre() {
        return sNombre;
    }


    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
}

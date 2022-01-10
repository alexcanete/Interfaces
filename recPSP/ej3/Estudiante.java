package ej3;
public class Estudiante{
    private int[] iId;
    private int iDormir;

    public Estudiante(int[] objetosLista, int iDormir) {
        this.iId = objetosLista;
        this.iDormir = iDormir;
    }
    public int[] getiId() {
        return iId;
    }
    public void setiId(int[] iId) {
        this.iId = iId;
    }
    public int getiDormir() {
        return iDormir;
    }
    public void setiDormir(int iDormir) {
        this.iDormir = iDormir;
    }  

   
    
}

package ej3;
public class Estudiante extends Thread{

    int iId;
    int iDormir;
    public Estudiante(int iId, int iDormir) {
        this.iId = iId;
        this.iDormir = iDormir;
    }
    public int getiId() {
        return iId;
    }
    public void setiId(int iId) {
        this.iId = iId;
    }
    public int getiDormir() {
        return iDormir;
    }
    public void setiDormir(int iDormir) {
        this.iDormir = iDormir;
    }  

   
    
}

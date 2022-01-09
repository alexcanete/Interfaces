package model;

public class Pc {
    
    int iId;
    String sMarca;
    String sModelo; 
    String sRam;
    double dPrecio;

    public Pc() {
    }

    public Pc(int iId, String sMarca, String sModelo, String sRam, double dPrecio) {
        this.iId = iId;
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.sRam = sRam;
        this.dPrecio = dPrecio;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getsMarca() {
        return sMarca;
    }

    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public String getsModelo() {
        return sModelo;
    }

    public void setsModelo(String sModelo) {
        this.sModelo = sModelo;
    }

    public String getsRam() {
        return sRam;
    }

    public void setsRam(String sRam) {
        this.sRam = sRam;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    @Override
    public String toString() {
        return "Pc [dPrecio=" + dPrecio + ", iId=" + iId + ", sMarca=" + sMarca + ", sModelo=" + sModelo + ", sRam="
                + sRam + "]";
    }
        
}

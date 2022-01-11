package model;

import javax.persistence.*;

@Entity
@Table(name = "ORDENADORES")
public class Pc {
  
    @Id
    @GeneratedValue(generator = "miSecuencia")
    @SequenceGenerator(name = "miSecuencia", sequenceName = "SEQ_PC", allocationSize = 1)
    @Column(name = "ID")
    int iId;

    @Column(name = "MARCA")
    String sMarca;

    @Column(name = "MODELO")
    String sModelo;
    
    @Column(name = "RAM")
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

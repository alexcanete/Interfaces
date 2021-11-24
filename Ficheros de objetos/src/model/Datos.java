package model;

public class Datos {
    int iDni;
    String sNombre;
    String sApellido;

    public Datos(int iDni, String sNombre, String sApellido) {
        this.iDni = iDni;
        this.sNombre = sNombre;
        this.sApellido = sApellido;
    }

    public int getiDni() {
        return iDni;
    }

    public void setiDni(int iDni) {
        this.iDni = iDni;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    @Override
    public String toString() {
        return "Datos [iDni=" + iDni + ", sApellido=" + sApellido + ", sNombre=" + sNombre + "]";
    }

    
}

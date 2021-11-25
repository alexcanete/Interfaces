package model;

public class Casa implements java.io.Serializable{
    static int iPoblacion;
    static Double dSuperficie;
    static int iAseos;
    public Casa(int iPoblacion, Double dSuperficie, int iAseos) {
        this.iPoblacion = iPoblacion;
        this.dSuperficie = dSuperficie;
        this.iAseos = iAseos;
    }

    public Casa() {
    }

    public static int getiPoblacion() {
        return iPoblacion;
    }

    public void setiPoblacion(int iPoblacion) {
        this.iPoblacion = iPoblacion;
    }

    public static Double getdSuperficie() {
        return dSuperficie;
    }

    public void setdSuperficie(Double dSuperficie) {
        this.dSuperficie = dSuperficie;
    }

    public static int getiAseos() {
        return iAseos;
    }

    public void setiAseos(int iAseos) {
        this.iAseos = iAseos;
    }

    @Override
    public String toString() {
        return "Casa [iAseos=" + iAseos + ", iPoblacion=" + iPoblacion + ", dSuperficie=" + dSuperficie + "]";
    }
    
}

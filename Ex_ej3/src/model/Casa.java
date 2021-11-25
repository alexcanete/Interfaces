package model;

@Entity
@Table(name = "casa")
public class Casa implements java.io.Serializable{

    @Id
    @GeneratedValue(generator = "miSecuencia")
    @SequenceGenerator(name = "miSecuencia", sequenceName = "SEQ_CASAS2", allocationSize = 1)
    @Column(name = "ID_CASAS")
    int id_casa;
    @Column(name = "POBLACION")
    int iPoblacion;
    @Column(name = "SUPERFICIE")
    Double dSuperficie;
    @Column(name = "ASEOS")
    int iAseos;
    public Casa(int iPoblacion, Double dSuperficie, int iAseos) {
        this.iPoblacion = iPoblacion;
        this.dSuperficie = dSuperficie;
        this.iAseos = iAseos;
    }

    public Casa() {
    }

    public  int getiPoblacion() {
        return iPoblacion;
    }

    public void setiPoblacion(int iPoblacion) {
        this.iPoblacion = iPoblacion;
    }

    public  Double getdSuperficie() {
        return dSuperficie;
    }

    public void setdSuperficie(Double dSuperficie) {
        this.dSuperficie = dSuperficie;
    }

    public  int getiAseos() {
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

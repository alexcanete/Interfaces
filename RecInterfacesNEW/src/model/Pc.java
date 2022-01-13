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

	@Column(name = "PROVEEDOR")
	String sProveedor;
    
    @Column(name = "MICRO")
	String sMicro;
    
    @Column(name = "RAM")
    String sRam;

    @Column(name = "PRECIO")
    double dPrecio;

    public Pc() {
    }

    public Pc(int iId, String sMarca, String sModelo, String sProveedor, String sMicro, String sRam, double dPrecio) {
        this.iId = iId;
        this.sMarca = sMarca;
        this.sModelo = sModelo;
		this.sProveedor = sProveedor;
        this.sMicro= sMicro;
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

	public String getsProveedor() {
		return sProveedor;
	}

	public void setsProveedor(String sProveedor) {
		this.sProveedor = sProveedor;
	}

	public String getsMicro() {
		return sMicro;
	}

	public void setsMicro(String sMicro) {
		this.sMicro = sMicro;
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
		return "Pc [dPrecio=" + dPrecio + ", iId=" + iId + ", sMarca=" + sMarca + ", sMicro=" + sMicro + ", sModelo="
				+ sModelo + ", sProveedor=" + sProveedor + ", sRam=" + sRam + "]";
	}

	
	

    
        
}

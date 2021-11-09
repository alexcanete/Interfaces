package model;


public class Persona {
	String sNombre;
	String sApellidos;
	String sCiclo;
	String sTurno;
	int iTalla;
	String sComentarios;
	String sSede;
	boolean boResponsable;
	
	
	public Persona(String sNombre, String sApellidos, String sCiclo, String sTurno, int iTalla, String sComentarios,
			String sSede, boolean boResponsable) {
		super();
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sCiclo = sCiclo;
		this.sTurno = sTurno;
		this.iTalla = iTalla;
		this.sComentarios = sComentarios;
		this.sSede = sSede;
		this.boResponsable = boResponsable;
	}


	public String getsNombre() {
		return sNombre;
	}


	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}


	public String getsApellidos() {
		return sApellidos;
	}


	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}


	public String getsCiclo() {
		return sCiclo;
	}


	public void setsCiclo(String sCiclo) {
		this.sCiclo = sCiclo;
	}


	public String getsTurno() {
		return sTurno;
	}


	public void setsTurno(String sTurno) {
		this.sTurno = sTurno;
	}


	public int getiTalla() {
		return iTalla;
	}


	public void setiTalla(int iTalla) {
		this.iTalla = iTalla;
	}


	public String getsComentarios() {
		return sComentarios;
	}


	public void setsComentarios(String sComentarios) {
		this.sComentarios = sComentarios;
	}


	public String getsSede() {
		return sSede;
	}


	public void setsSede(String sSede) {
		this.sSede = sSede;
	}


	public boolean isBoResponsable() {
		return boResponsable;
	}


	public void setBoResponsable(boolean boResponsable) {
		this.boResponsable = boResponsable;
	}


	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sApellidos=" + sApellidos + ", sCiclo=" + sCiclo + ", sTurno="
				+ sTurno + ", iTalla=" + iTalla + ", sComentarios=" + sComentarios + ", sSede=" + sSede
				+ ", boResponsable=" + boResponsable + "]";
	}
	
	
}

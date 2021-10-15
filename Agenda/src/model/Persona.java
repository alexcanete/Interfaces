package model;

public class Persona {
	
	String sNombre;
	String sTelefono;
	
	
	public Persona(String sNombre, String sTelefono) {
		super();
		this.sNombre = sNombre;
		this.sTelefono = sTelefono;
	}




	public String getsNombre() {
		return sNombre;
	}


	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}


	public String getsTelefono() {
		return sTelefono;
	}


	public void setsTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}


	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sTelefono=" + sTelefono + "]";
	}
	
}

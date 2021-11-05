package model;

public class Conexion {
	private String usuario;
	private String contrasena;
	private String host;
	private String puerto;
	private String baseDatos;
	
	public Conexion(String usuario, String contrasena, String host, String puerto, String baseDatos) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.host = host;
		this.puerto = puerto;
		this.baseDatos = baseDatos;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	

}

package model;

public class Coche {

    private Integer idCoche;
    private String marca;
    private String modelo;
    private Integer potencia;

    public Coche() {
    }

    public Coche(String marca, String modelo, Integer potencia) {
       
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Coche(Integer idCoche, String marca, String modelo, Integer potencia) {
        this.idCoche = idCoche;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Integer getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(Integer idCoche) {
        this.idCoche = idCoche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche [idCoche=" + idCoche + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
    }
    
}

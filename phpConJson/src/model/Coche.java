package model;

public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private String potencia;
    public Coche(int id, String marca, String modelo, String potencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    public Coche() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
    }


}

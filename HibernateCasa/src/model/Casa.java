package model;

public class Casa {

    private int id_casa;
    private String calle;
    private Integer numero;
    private Double superficie;

    public Casa() {
    }

    public Casa(String calle, Integer numero, Double superficie) {
        this.calle = calle;
        this.numero = numero;
        this.superficie = superficie;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Casa [calle=" + calle + ", id_casa=" + id_casa + ", numero=" + numero + ", superficie=" + superficie
                + "]";
    }

    
}

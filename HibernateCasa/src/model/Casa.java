package model;

import javax.persistence.*;


@Entity
@Table(name = "casa")   
public class Casa {

    @Id
    @GeneratedValue(generator = "seqCasa")
    @SequenceGenerator(name = "seqCasa", sequenceName = "SEQ_CASA", allocationSize = 1)
    @Column(name = "ID_CASA")
    private int id_casa;

    @Column(name = "CALLE")
    private String calle;

    @Column(name = "NUMERO")
    private int numero;

    @Column(name = "SUPERFICIE")
    private Double superficie;

    public Casa() {
    }

    public Casa(String calle, int numero, Double superficie) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

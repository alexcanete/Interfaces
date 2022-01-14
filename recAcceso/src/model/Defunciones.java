package model;

import javax.persistence.*;
import javax.print.DocFlavor.STRING;

@Entity
@Table(name = "DEFUNCIONES")
public class Defunciones {

    @Id
    @GeneratedValue(generator = "miSecuencia")
    @SequenceGenerator(name = "miSecuencia", sequenceName = "SEQ_DEF", allocationSize = 1)
    @Column(name = "ID")
    int id;

    @Column(name = "CCAA")
    String sCcaa;

    @Column(name = "TIPO DE DATO")
    String sTipoDeDato;

    @Column(name = "PERIODO")
    String sPeriodo;

    @Column(name = "TOTAL")
    String sTotal;
    
    public Defunciones() {
    }

    public Defunciones(String sCcaa, String sTipoDeDato, String sPeriodo, String sTotal) {
        this.sCcaa = sCcaa;
        this.sTipoDeDato = sTipoDeDato;
        this.sPeriodo = sPeriodo;
        this.sTotal = sTotal;
    }

    public Defunciones(int id, String sCcaa, String sTipoDeDato, String sPeriodo, String sTotal) {
        this.id = id;
        this.sCcaa = sCcaa;
        this.sTipoDeDato = sTipoDeDato;
        this.sPeriodo = sPeriodo;
        this.sTotal = sTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsCcaa() {
        return sCcaa;
    }

    public void setsCcaa(String sCcaa) {
        this.sCcaa = sCcaa;
    }

    public String getsTipoDeDato() {
        return sTipoDeDato;
    }

    public void setsTipoDeDato(String sTipoDeDato) {
        this.sTipoDeDato = sTipoDeDato;
    }

    public String getsPeriodo() {
        return sPeriodo;
    }

    public void setsPeriodo(String sPeriodo) {
        this.sPeriodo = sPeriodo;
    }

    public String getsTotal() {
        return sTotal;
    }

    public void setsTotal(String sTotal) {
        this.sTotal = sTotal;
    }

    @Override
    public String toString() {
        return "Defunciones [sCcaa=" + sCcaa + ", sPeriodo=" + sPeriodo + ", sTipoDeDato=" + sTipoDeDato + ", sTotal="
                + sTotal + "]";
    }

    
    
}

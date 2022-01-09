package model;

import javax.print.DocFlavor.STRING;

public class Defunciones {
    String sCcaa;
    String sTipoDeDato;
    String sPeriodo;
    String sTotal;
    
    public Defunciones(String sCcaa, String sTipoDeDato, String sPeriodo, String sTotal) {
        this.sCcaa = sCcaa;
        this.sTipoDeDato = sTipoDeDato;
        this.sPeriodo = sPeriodo;
        this.sTotal = sTotal;
    }

    public Defunciones() {
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

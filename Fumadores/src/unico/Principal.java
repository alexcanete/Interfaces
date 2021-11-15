package unico;

public class Principal {
    public static void main(String[] args) {

        Mesa mesa = new Mesa();
        Estanquero estanquero = new Estanquero(mesa);
        Fumador[] fumador = new Fumador[3];
        for (int i = 0; i < fumador.length; i++) {
            fumador[i] = new Fumador(i, mesa);
        }


        estanquero.start();

        for (int i = 0; i < fumador.length; i++) {
            fumador[i].start();
        }
        
    }

}

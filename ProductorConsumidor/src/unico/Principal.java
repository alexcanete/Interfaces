package unico;

public class Principal {
    public static void main(String[] args) {
        final int dorirProductor = 1000, dorirConsumidor = 1000;

        Buffer almacen = new Buffer();
        Productor productor = new Productor(almacen, dorirProductor);
        Consumidor consumidor = new Consumidor(almacen, dorirConsumidor);

        productor.start();
        consumidor.start();
    }

}

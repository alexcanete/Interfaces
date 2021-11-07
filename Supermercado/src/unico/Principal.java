package unico;

public class Principal {
    //main
    public static void main(String[] args) {
        final int dormircajera= 1000;
        final int dormircliente= 2000;

        Buffer almacen = new Buffer();
        Cajera cajera = new Cajera(almacen, dormircajera);
        Cliente cliente = new Cliente(almacen, dormircliente);

        cajera.start();
        cliente.start();
    }
}

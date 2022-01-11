public class ej5 {
    public static void main(String[] args){

        final int tiempoEnSala= 1000; //1 segundo
        
        Buffer sala = new Buffer();

        Paciente paciente1 = new Paciente(true, 1, tiempoEnSala, sala);
        Paciente paciente2 = new Paciente(false, 2, tiempoEnSala, sala);
        Paciente paciente3 = new Paciente(true, 3, tiempoEnSala, sala);
        Paciente paciente4 = new Paciente(false, 4, tiempoEnSala, sala);
        Paciente paciente5 = new Paciente(false, 5, tiempoEnSala, sala);

        paciente1.start();
        paciente2.start();
        paciente3.start();
        paciente4.start();
        paciente5.start();
        
    }
}

public class Buffer {
    private int contenido;
    private boolean disponible = false;

    public synchronized int entra() {
        while (disponible = true) {
            
            System.out.println("Paciente recoge los resultados y sale");
            
           
        }
        disponible = true;
        notify();
        return contenido;
    }

    public synchronized void sale(int value) {

        while (disponible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        contenido= value;
        disponible = false;
        notify();
    }
}

package ej3;
public class Cocinero extends Thread{
    private Estudiante estudiante;
    private int dormir;

    //contructor
    public Cocinero(Estudiante estudiante, int dormir) {
        this.estudiante = estudiante;
        this.dormir = dormir;
    }

    public void run() { //metodo run
        int iSuma=0;
       for (int i = 0; i < clien.getiCompra().length; i++) { //recorre el array
        System.out.println("La cajera "+getsNombre()+" ha pasado el producto "+i+" del cliente "+clien.getsNombre()+
        " y ha tardado "+clien.getiCompra()[i]);
        iSuma+=clien.getiCompra()[i]; //suma los valores del array
        try {
            Thread.sleep(this.dormir); //duerme
        } catch (InterruptedException ex) {
            System.out.println("Error en la cajera");
        }
       } 
       System.out.println("La cajera "+getsNombre()+" ha pasado la compra del cliente "+clien.getsNombre()+
       " y ha tardado "+iSuma+" segundos en total");          

    }




    // getter y setters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getDormir() {
        return dormir;
    }

    public void setDormir(int dormir) {
        this.dormir = dormir;
    }

    

    
}


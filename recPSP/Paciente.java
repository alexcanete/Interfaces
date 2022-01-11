public class Paciente extends Thread{
    private boolean covid;
    private int paciente;
    private int dormir;
    private Buffer sala;

    public Paciente(boolean covid, int paciente, int dormir, Buffer sala) {
        this.covid = covid;
        this.paciente = paciente;
        this.dormir = dormir;
        this.sala = sala;
    }

    public void run(){
        int valor =0;
        for (int i=1; i<10; i++){
            if (covid==false){
                valor = sala.entra();
                System.out.println("Paciente negativo "+paciente+" entra en la sala");
                try{
                    sleep(dormir);
                }catch(InterruptedException e){
                    System.err.println("Error en Paciente");
                    e.printStackTrace();
                }
            }else{
                valor = sala.entra();
                System.out.println("Paciente positivo "+paciente+" entra en la sala");
                try{
                    sleep(dormir);
                }catch(InterruptedException e){
                    System.err.println("Error en Paciente");
                    e.printStackTrace();
                }
            }
        }        
    }

    public boolean isCovid() {
        return covid;
    }

    public void setCovid(boolean covid) {
        this.covid = covid;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getDormir() {
        return dormir;
    }

    public void setDormir(int dormir) {
        this.dormir = dormir;
    }

    public Buffer getSala() {
        return sala;
    }

    public void setSala(Buffer sala) {
        this.sala = sala;
    }
    

    


}

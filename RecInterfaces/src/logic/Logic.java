package logic;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import model.Pc;

public class Logic {

    public static void insert(){
        try{
            org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
            java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
            SessionFactory conf = new Configuration().configure().buildSessionFactory();
            Session session = conf.openSession();
    
            Transaction tx = session.beginTransaction();
    
            Pc pc = new Pc();
            
            pc.setsMarca("HP");
            pc.setsModelo("ProBook");
            pc.setsRam("8GB");
            pc.setdPrecio(1000);
    
            session.save(pc); 
    
            
        
    
            System.out.println("PC guardado");
            tx.commit();

            session.close();

            conf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
       

        

    
    }
    
}

package logic;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import model.Pc;
import view.FrmPrincipal;

public class Logic {

    public static void insert(){
        try{
            org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
            java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
            SessionFactory conf = new Configuration().configure().buildSessionFactory();
            Session session = conf.openSession();
    
            Transaction tx = session.beginTransaction();
            
            Pc pc = new Pc();
            pc.setsMarca(view.FrmNuevoPC.lblMarcaSeleccionada.getText());
            pc.setsModelo(view.FrmNuevoPC.txtModelo.getText() + "");
            pc.setsProveedor(view.FrmNuevoPC.comboboxListProveedor.getSelectedItem() + "");
            pc.setsMicro(view.FrmNuevoPC.comboboxListMicro.getSelectedItem() + "");
            pc.setsRam(view.FrmNuevoPC.comboboxListRam.getSelectedItem() + "");
            pc.setdPrecio(Double.parseDouble(view.FrmNuevoPC.txtPrecio.getText()));

            session.save(pc);
           getAllPc();

            System.out.println(pc);
            System.out.println("PC guardado");
            tx.commit();

            session.close();

            conf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        

    
    }
    public static void delete(){
        try{
            org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
            java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
            SessionFactory conf = new Configuration().configure().buildSessionFactory();
            Session session = conf.openSession();
    
            Transaction tx = session.beginTransaction();
            getAllPc();
            int selectedRow = FrmPrincipal.table.getSelectedRow();
            if(selectedRow > -1){
                Pc pc = FrmPrincipal.listaPc.get(selectedRow);
                session.delete(pc);
    
                System.out.println(pc);
                System.out.println("PC eliminado");
                tx.commit();
    
                session.close();
    
                conf.close();
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }

    public static void getAllPc(){
        SessionFactory conf = new Configuration().configure().buildSessionFactory();
        Session session = conf.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Pc");
        FrmPrincipal.listaPc = (ArrayList<Pc>) query.list();
        tx.commit();
        session.close();
        conf.close();
    }

    public static void update(){
        try{
            org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
            java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
            SessionFactory conf = new Configuration().configure().buildSessionFactory();
            Session session = conf.openSession();
            int selectedRow = FrmPrincipal.table.getSelectedRow();
            getAllPc();
            if(selectedRow > -1){
                Transaction tx = session.beginTransaction();
            
            // Pc pc = new Pc();
            
                Pc pc = FrmPrincipal.listaPc.get(selectedRow);
                pc.setsMarca(view.FrmEditarPC.lblMarcaSeleccionada.getText() + "");
                pc.setsModelo(view.FrmEditarPC.txtModelo.getText() + "");
                pc.setsProveedor(view.FrmEditarPC.comboboxListProveedor.getSelectedItem() + "");
                pc.setsMicro(view.FrmEditarPC.comboboxListMicro.getSelectedItem() + "");
                pc.setsRam(view.FrmEditarPC.comboboxListRam.getSelectedItem() + "");
                pc.setdPrecio(Double.parseDouble(view.FrmEditarPC.txtPrecio.getText()));


            session.update(pc);

            System.out.println(pc);
            System.out.println("PC guardado");
            tx.commit();

            session.close();

            conf.close();
            }
    
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        

    
    }

    
    
}

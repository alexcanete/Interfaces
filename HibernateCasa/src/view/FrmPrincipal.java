package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Casa;

public class FrmPrincipal {
	public static void main(String[] args) {
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		SessionFactory conf = new Configuration().configure().buildSessionFactory();
			Session session = conf.openSession();

			Transaction tx = session.beginTransaction();

			Casa c = new Casa("falsacalle2", 523, 432.78);
			//session.delete(c);
			//session.dalete(c);
			//session.update(c);
			//session.saveOrUpdate(c);
			//session.byId(Coche.class).getReference(c.getId());
			session.save(c);
			
			
			
			List<Casa> casas = session.createQuery("from Casa").list();
			
			for(Casa c1 : casas) {
				System.out.println(c1.getCalle() + " " + c1.getNumero() + " " + c1.getSuperficie());
			}
		
			System.out.println("Casa guardada");
			tx.commit();

			session.close();

		conf.close();
	}
	
}


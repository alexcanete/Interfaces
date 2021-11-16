package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Coche;

public class frmPrincipal {
	public static void main(String[] args) {
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		SessionFactory conf = new Configuration().configure().buildSessionFactory();
			Session session = conf.openSession();

			Transaction tx = session.beginTransaction();

			//Coche c	 = new Coche("Audi", "A3", 1995);
			//session.delete(c);
			//session.dalete(c);
			//session.update(c);
			//session.saveOrUpdate(c);
			//session.byId(Coche.class).getReference(c.getId());
			//session.save(c);
			
			List<Coche> lista = session.createQuery("from Coche").list();
			
			lista.forEach(c -> System.out.println(c));

			



			System.out.println("Coche guardado");
			tx.commit();

			session.close();

		conf.close();
	}
	
}

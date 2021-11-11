package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Coche;

public class frmPrincipal {
	public static void main(String[] args) {
		SessionFactory conf = new Configuration().configure().buildSessionFactory();
			Session session = conf.openSession();

			Transaction tx = session.beginTransaction();

			Coche c	 = new Coche("Audi", "A6", 1990);
			session.save(c);

			tx.commit();

			session.close();

		conf.close();
	}
	
}

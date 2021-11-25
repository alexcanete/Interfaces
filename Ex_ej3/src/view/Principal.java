package view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Casa;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Casa;

public class Principal {

	public static void main(String[] args) throws Exception {

		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		SessionFactory conf = new Configuration().configure().buildSessionFactory();
			Session session = conf.openSession();

			Transaction tx = session.beginTransaction();

			Casa c	 = new Casa(2,3.2,3);
			
			List<Casa> lista = session.createQuery("from CASAS").list();
			
			lista.forEach(c -> System.out.println(c));

			



			System.out.println("Coche guardado");
			tx.commit();

			session.close();

		conf.close();
		
		
	}

	
}

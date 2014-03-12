package org.hibernate.examples.quickstart;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	static{
		try{ //create the SessionFactory
			sessionFactory = new Configuration().configure().buildSessionFactory(); 
			
			
		}catch(Throwable ex){
			ex.printStackTrace();
		}
	}
	public static final ThreadLocal session = new ThreadLocal();
	
	public static Session currentSession(){
		Session s = (Session)session.get();
		if(s==null){
			s=sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	
	public static void closeSession(){
		Session s = (Session)session.get();
		if(s!=null)s.close();
		session.set(null);
	}
}

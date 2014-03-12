package com.icss.exthome.LoginServlet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static String CONFIG_FILE_LOCATION ="/hibernate.cfg.xml";
	private static final ThreadLocal threadLocal = new ThreadLocal();
	private static SessionFactory sessionFactory;
	private static Configuration configuration = new Configuration();
	private static String configFile = CONFIG_FILE_LOCATION;
	private HibernateSessionFactory(){}
	public static Session getSession()throws HibernateException{
		Session session = (Session)threadLocal.get();
		if(session ==null||!session.isOpen()){
			if(sessionFactory ==null){
				rebuildSessionFactory();
			}
			session = (sessionFactory!=null)?sessionFactory.openSession():null;
			threadLocal.set(session);
		}
		return session;
	}
	public static void  rebuildSessionFactory(){
		try{
			sessionFactory = new Configuration().configure(configFile).buildSessionFactory(); 
			
		}catch(Exception e){
			System.out.println("--------Error Creating SessionFactory---------");
			e.printStackTrace();
		}
	}
	
	public static void closeSession()throws HibernateException{
		Session session = (Session)threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Configuration getConfiguration(){
		return configuration;
	}
	
	

}

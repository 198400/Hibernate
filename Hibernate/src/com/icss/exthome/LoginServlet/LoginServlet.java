package com.icss.exthome.LoginServlet;

import hibernate.PO.Book;
import hibernate.PO.Event;
import hibernate.PO.Student;
import hibernate.PO.User;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.examples.quickstart.HibernateUtil;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html;charset=GBK";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
<<<<<<< HEAD  who am i  hello workd

			System.out.println("-----------------goto doGetMethond---------------------------");
			System.out.println("hello world");
			System.out.println("--------gagag---------gotogagagagag doGetMethond---------------------------");


			/*
			 * request.getRequestDispatcher("/jsp/pageNoteServlet").forward(request,
					response);
			 * 
			User us = new User();
			us.setUserName("zhansan");
			us.setUserPwd("2");
			us.setRodxid(2);
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			session.save(us);
			tx.commit();
			session.close();*/
			doCreate();
			doQuery();
			
			System.out.println("-----------------end doGetMethond---------------------------");
			
			
		
	}
	
	private void doCreate(){
		
		Session session = HibernateUtil.currentSession();
		
		session.beginTransaction();
		
		Student student = new Student();
		
		student.setSname("xiaoWang");
		
		student.setSage("22");
		
		Set<Book> bookSet = new HashSet();
		
		Book book = null;
		
		for (int i = 0; i < 2; i++) {
			
			book = new Book();
			
			book.setBname("java " + i);
			
			book.setBprice("50");
			
			bookSet.add(book);
		}
		
		student.setBook(bookSet);
		
		session.save(student);
		
		session.flush();
		
		session.getTransaction().commit();
		
	}
	
	
	private void doQuery(){
		
		Session session = HibernateUtil.currentSession();
		
		Query q = session.createQuery("select s from Student as s");
		
		List l = q.list();
		
		Student s = null;
		
		Book book = null;
		
		for(int i =0;i<l.size();i++){
			
			s = (Student) l.get(i);
			System.out.println("姓名： " + s.getSname());
			System.out.println("年龄： " + s.getSage());
			System.out.println("所有的书：");
			Iterator it = s.getBook().iterator();
			while (it.hasNext()) {
				book = (Book) it.next();
				System.out.println("书名： " + book.getBname());
				System.out.println("价格：" + book.getBprice());
			}
			
		}
		
		session.close();
		
		
		
		
		
		
		
	}
	
	private void addPersonToEvent(double personId,int eventId){
		
		Session session = HibernateUtil.currentSession();
		
		session.beginTransaction();
		
		User aPerson = (User)session.load(User.class, personId);
		
		Event anEvent = (Event)session.load(Event.class, eventId);
		
		aPerson.getEvents().add(anEvent);
		
		session.getTransaction().commit();
		
	}

}

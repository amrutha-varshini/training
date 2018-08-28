package com.minicare.dao;
import com.minicare.model.Active;
import com.minicare.model.Sitter;
import com.minicare.model.SeekerJob;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.minicare.model.HibernateUtil;
import java.util.*;
public class SitterDao
{
	public static void add(int id,String title,String desc)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Sitter user=(Sitter)session.load(Sitter.class, id);
		user.setTitle(title);
		user.setDesc(desc);
		session.getTransaction().commit();
		session.close();
	}
	public static Sitter getSitter(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Sitter user=(Sitter)session.load(Sitter.class, id);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public static List<Sitter> getSitters(Integer zip)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		List<Sitter> UserList=new ArrayList<Sitter>();
		UserList = session.createQuery("FROM Sitter WHERE ZIP='"+zip+"' and status='"+Active.ACTIVE+"'").list();
		session.getTransaction().commit();
		session.close();
		return UserList;
	}
	public static List<Sitter> getSitters()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		List<Sitter> UserList=new ArrayList<Sitter>();
		UserList = session.createQuery("FROM Sitter WHERE status='"+Active.ACTIVE+"'").list();
		session.getTransaction().commit();
		session.close();
		return UserList;
	}
	public static String getFname(Sitter s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String fname=s.getFname();
		session.getTransaction().commit();
		session.close();
		return fname;
	}
	public static String getLname(Sitter s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String lname=s.getLname();
		session.getTransaction().commit();
		session.close();
		return lname;
	}
	public static String getEmail(Sitter s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String email=s.getEmail();
		session.getTransaction().commit();
		session.close();
		return email;
	}
	public static String getPhno(Sitter s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String phno=s.getPhno();
		session.getTransaction().commit();
		session.close();
		return phno;
	}
	public static String getZip(Sitter s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String zip=s.getZip();
		session.getTransaction().commit();
		session.close();
		return zip;
	}
	public static String getTitle(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Sitter s=(Sitter)session.load(Sitter.class, id);
		String title=s.getTitle();
		session.getTransaction().commit();
		session.close();
		return title;
	}
	public static String getDesc(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Sitter s=(Sitter)session.load(Sitter.class, id);
		String desc=s.getDesc();
		session.getTransaction().commit();
		session.close();
		return desc;
	}
	public static Set<SeekerJob> getJob(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Sitter s=(Sitter)session.load(Sitter.class, id);
		Set<SeekerJob> job=s.getJob();
		session.getTransaction().commit();
		session.close();
		return job;
	}
}
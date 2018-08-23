package com.minicare.dao;

import com.minicare.model.Sitter;

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
		UserList = session.createQuery("FROM Sitter").list();
		if(zip!=null)
		{
			for(Iterator i=UserList.iterator();i.hasNext();)
			{
				if(!(((Sitter)i.next()).getZip().equals(zip)))
					i.remove();
			}
		}
		session.getTransaction().commit();
		session.close();
		return UserList;
	}
}
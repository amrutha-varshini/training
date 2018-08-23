package com.minicare.dao;

import com.minicare.model.SeekerJob;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
import com.minicare.model.HibernateUtil;
import com.minicare.model.Sitter;
public class SeekerJobDao
{
	public static void add(int uid,String title,String desc)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		SeekerJob job=new SeekerJob();
		Integer id = (Integer) session.save(job);
		job.setUserid(uid);
		job.setTitle(title);
		job.setDesc(desc);
		session.getTransaction().commit();
		session.close();
	}
	public static List<SeekerJob> getJob(Integer zip)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		List<SeekerJob> UserList=new ArrayList<SeekerJob>();
		UserList = session.createQuery("FROM SeekerJob").list();
		if(zip!=null)
		{
			for(Iterator i=UserList.iterator();i.hasNext();)
			{
				if(!(UsersDao.getUser(((SeekerJob)i.next()).getUserid()).getZip().equals(zip)))
					i.remove();
			}
		}
		session.getTransaction().commit();
		session.close();
		return UserList;
	}
	public static void apply(int jid,int sid)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		SeekerJob job=(SeekerJob)session.load(SeekerJob.class, jid);
		Sitter user=(Sitter)session.load(Sitter.class, sid);
		job.getSitter().add(user);
		session.save(job);
		session.getTransaction().commit();
		session.close();
	}
}
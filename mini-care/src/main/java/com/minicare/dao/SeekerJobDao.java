package com.minicare.dao;
import com.minicare.model.Users;
import com.minicare.model.SeekerJob;
import com.minicare.dao.UsersDao;
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
		Integer id=(Integer)session.save(job);
		job.setSjid(id);
		Users user=UsersDao.getUser(uid);
		job.setUser(user);
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
		UserList = session.createQuery("FROM SeekerJob WHERE ZIP='"+zip+"'").list();
		session.getTransaction().commit();
		session.close();
		return UserList;
	}
	public static List<SeekerJob> getJob()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		List<SeekerJob> UserList=new ArrayList<SeekerJob>();
		UserList = session.createQuery("FROM SeekerJob").list();
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
	public static String getTitle(SeekerJob s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String title=s.getTitle();
		session.getTransaction().commit();
		session.close();
		return title;
	}
	public static String getDesc(SeekerJob s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		String desc=s.getDesc();
		session.getTransaction().commit();
		session.close();
		return desc;
	}
	public static Users getUser(SeekerJob s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=s.getUser();
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public static int getUserid(SeekerJob s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=s.getUser();
		int id=UsersDao.getUserid(user);
		session.getTransaction().commit();
		session.close();
		return id;
	}
	public static int getSjid(SeekerJob s)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		int sjid=s.getSjid();
		session.getTransaction().commit();
		session.close();
		return sjid;
	}
}
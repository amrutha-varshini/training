package com.minicare.dao;

import com.minicare.model.Address;
import com.minicare.model.Users;
import com.minicare.model.Active;
import com.minicare.model.Sitter;
import com.minicare.model.SeekerJob;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.minicare.model.HibernateUtil;

import java.sql.Timestamp;
import java.util.*;
public class UsersDao{
	public static int check(String userID)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		List<Users> UserList=new ArrayList<Users>();
		UserList = session.createQuery("FROM Users").list();
		for(Users u:UserList)
		{
			if(u.getEmail().equals(userID) && u.getStatus().equals(Active.ACTIVE))
			{
				session.getTransaction().commit();
				session.close();
				return u.getId();
			}
		}
		session.getTransaction().commit();
		session.close();
		return -1;
	}
	public static int login(int id,String pwd,String mem)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		if(!user.getPwd().equals(pwd))
		{
			session.getTransaction().commit();
			session.close();
			return -1;
		}
		else if(!user.getRole().equals(mem))
		{
			session.getTransaction().commit();
			session.close();
			return -2;
		}
		session.getTransaction().commit();
		session.close();
		return 0;
	}
	public static String getFname(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		String fname=user.getFname();
		session.getTransaction().commit();
		session.close();
		return fname;
	}
	public static String getLname(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		String lname=user.getLname();
		session.getTransaction().commit();
		session.close();
		return lname;
	}
	public static String getZip(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		String zip=user.getZip();
		session.getTransaction().commit();
		session.close();
		return zip;
	}
	public static String getRole(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		String role=user.getRole();
		session.getTransaction().commit();
		session.close();
		return role;
	}
	public static int getUserid(Users user)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		int userid=user.getId();
		session.getTransaction().commit();
		session.close();
		return userid;
	}
	public static Users getUser(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public static void add(String mem,String lname,String fname,String userID,String pwd,String phno,String zip,String al1,String al2,String city,String states)
	{
		Calendar calendar = Calendar.getInstance();
		Timestamp ts = new Timestamp(calendar.getTime().getTime());
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users users;
		if("sitter".equals(mem))
			users=new Sitter();
		else 
			users=new Users();
		Integer id = (Integer) session.save(users);
		users.setId(id);
		users.setRole(mem);
		users.setFname(fname);
		users.setLname(lname);
		users.setEmail(userID);
		users.setPwd(pwd);
		users.setPhno(phno);
		users.setZip(zip);
		users.setLastActive(ts);
		users.setStatus(Active.ACTIVE);
		AddressDao.add(al1,al2,city,states,users);
		session.getTransaction().commit();
		session.close();
	}		
	public static void invalidate(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		user.setStatus(Active.INACTIVE);
		session.getTransaction().commit();
		session.close();
	}
	public static Map<String,Set<Sitter>> getJobApplication(int id)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Users user=(Users)session.load(Users.class, id);
		Set<SeekerJob> jobs=user.getSeekerJob();
		Map<String,Set<Sitter>> res=new HashMap<String,Set<Sitter>>();
		for(SeekerJob s:jobs)
			res.put(s.getTitle(),s.getSitter());
		session.getTransaction().commit();
		session.close();
		return res;
	}
}
package com.minicare.model;
import com.minicare.model.Users;
import java.util.Set;

public class SeekerJob {
	private int sjid;
	private Users user;
	private String title,desc;
	private Set<Sitter> sitter;
	public int getSjid()
	{
		return sjid;
	}
	public Users getUser()
	{
		return user;
	}
	public String getTitle()
	{
		return title;
	}
	public String getDesc()
	{
		return desc;
	}
	public Set<Sitter> getSitter()
	{
		return sitter;
	}
	public void setSjid(int sjid)
	{
		this.sjid=sjid;
	}
	public void setUser(Users user)
	{
		this.user=user;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public void setSitter(Set<Sitter> sitter)
	{
		this.sitter=sitter;
	}
}
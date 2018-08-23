package com.minicare.model;
import java.util.Set;

public class SeekerJob {
	private int sjid,userid;
	private String title,desc;
	private Set<Sitter> sitter;
	public int getSjid()
	{
		return sjid;
	}
	public int getUserid()
	{
		return userid;
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
	public void setUserid(int userid)
	{
		this.userid=userid;
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
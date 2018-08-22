package com.minicare;

import java.util.Set;

public class SeekerJob {
	private int sid,userid;
	private String title,desc;
	private Set<Sitter> sitter;
	int getSid()
	{
		return sid;
	}
	int getUserid()
	{
		return userid;
	}
	String getTitle()
	{
		return title;
	}
	String getDesc()
	{
		return desc;
	}
	Set<Sitter> getSitter()
	{
		return sitter;
	}
	void setSid(int sid)
	{
		this.sid=sid;
	}
	void setUserid(int userid)
	{
		this.userid=userid;
	}
	void setTitle(String title)
	{
		this.title=title;
	}
	void setDesc(String desc)
	{
		this.desc=desc;
	}
	void setSitter(Set<Sitter> sitter)
	{
		this.sitter=sitter;
	}
}
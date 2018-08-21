package com.minicare;

import java.util.Set;

public class Sitter extends Users {
	private String title,desc;
	private Set<SeekerJob> seekerJob;
	String getTitle()
	{
		return title;
	}
	String getDesc()
	{
		return desc;
	}
	Set<SeekerJob> getSeekerJob()
	{
		return seekerJob;
	}
	void setTitle(String title)
	{
		this.title=title;
	}
	void setDesc(String desc)
	{
		this.desc=desc;
	}
	void setSeekerJob(Set<SeekerJob> seekerJob)
	{
		this.seekerJob=seekerJob;
	}
}

package com.minicare;
import java.sql.Timestamp;
import java.util.Set;
public class Users {
	enum active
	{ACTIVE,INACTIVE};
	private int id;
	private String fname,lname,email,pwd,zip;
	private Timestamp lastActive; 
	private active status;
	private Address address;
	private Set<SeekerJob> seekerJob;
	int getId()
	{
		return id;
	}
	String getFname()
	{
		return fname;
	}
	String getLname()
	{
		return lname;
	}
	String getEmail()
	{
		return email;
	}
	String getPwd()
	{
		return pwd;
	}
	String getZip()
	{
		return zip;
	}
	Timestamp getLastActive()
	{
		return lastActive;
	}
	active getStatus()
	{
		return status;
	}
	Address getAddress()
	{
		return address;
	}
	Set<SeekerJob> getSeekerJob()
	{
		return seekerJob;
	}
	void setId(int id)
	{
		this.id= id;
	}
	void setFname(String fname)
	{
		this.fname= fname;
	}
	void setLname(String lname)
	{
		this.lname= lname;
	}
	void setEmail(String email)
	{
		this.email= email;
	}
	void setPwd(String pwd)
	{
		this.pwd= pwd;
	}
	void setZip(String zip)
	{
		this.zip= zip;
	}
	void setLastActive(Timestamp lastActive)
	{
		this.lastActive= lastActive;
	}
	void setStatus(active status)
	{
		this.status= status;
	}
	void setAddress(Address address)
	{
		this.address=address;
	}
	void setSeekerJob(Set<SeekerJob> seekerJob)
	{
		this.seekerJob=seekerJob;
	}
}

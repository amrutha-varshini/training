package com.minicare.model;
import java.sql.Timestamp;
import java.util.Set;
import com.minicare.model.Active;
public class Users {
	private int id;
	private String role,fname,lname,email,pwd,phno,zip;
	private Timestamp lastActive; 
	private Active status;
	private Address address;
	private Set<SeekerJob> seekerJob;
	public int getId()
	{
		return id;
	}
	public String getRole()
	{
		return role;
	}
	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPwd()
	{
		return pwd;
	}
	public String getPhno()
	{
		return phno;
	}
	public String getZip()
	{
		return zip;
	}
	public Timestamp getLastActive()
	{
		return lastActive;
	}
	public Active getStatus()
	{
		return status;
	}
	public Address getAddress()
	{
		return address;
	}
	public Set<SeekerJob> getSeekerJob()
	{
		return seekerJob;
	}
	public void setId(int id)
	{	
		System.out.println(id);
		this.id= id;
	}
	public void setRole(String role)
	{
		this.role=role;
	}
	public void setFname(String fname)
	{
		this.fname= fname;
	}
	public void setLname(String lname)
	{
		this.lname= lname;
	}
	public void setEmail(String email)
	{
		this.email= email;
	}
	public void setPwd(String pwd)
	{
		this.pwd= pwd;
	}
	public void setPhno(String phno)
	{
		this.phno=phno;
	}
	public void setZip(String zip)
	{
		this.zip= zip;
	}
	public void setLastActive(Timestamp lastActive)
	{
		this.lastActive= lastActive;
	}
	public void setStatus(Active status)
	{
		this.status= status;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public void setSeekerJob(Set<SeekerJob> seekerJob)
	{
		this.seekerJob=seekerJob;
	}
}

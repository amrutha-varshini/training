package com.minicare;

public class Address {
	private int id;
	private String addressLine1,addressLine2,city,states;
	int getId()
	{
		return id;
	}
	String getAddressLine1()
	{
		return addressLine1;
	}
	String getAddressLine2()
	{
		return addressLine2;
	}
	String getCity()
	{
		return city;
	}
	String getStates()
	{
		return states;
	}
	void setId(int id)
	{
		this.id= id;
	}
	void setAddressLine1(String addressLine1)
	{
		this.addressLine1= addressLine1;
	}
	void setAddressLine2(String addressLine2)
	{
		this.addressLine2= addressLine1;
	}
	void setCity(String city)
	{
		this.city= city;
	}
	void setStates(String states)
	{
		this.states= states;
	}
}

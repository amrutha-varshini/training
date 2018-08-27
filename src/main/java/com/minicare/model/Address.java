package com.minicare.model;

public class Address {
	private String addressLine1,addressLine2,city,states;
	public String getAddressLine1()
	{
		return addressLine1;
	}
	public String getAddressLine2()
	{
		return addressLine2;
	}
	public String getCity()
	{
		return city;
	}
	public String getStates()
	{
		return states;
	}
	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1= addressLine1;
	}
	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2= addressLine1;
	}
	public void setCity(String city)
	{
		this.city= city;
	}
	public void setStates(String states)
	{
		this.states= states;
	}
}

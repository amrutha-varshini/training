package com.minicare.dao;

import com.minicare.model.Users;
import com.minicare.model.Address;

public class AddressDao
{
	public static void add(String al1,String al2,String city,String states,Users users)
	{
		Address address=new Address();
		address.setAddressLine1(al1);
		address.setAddressLine2(al2);
		address.setCity(city);
		address.setStates(states);
		users.setAddress(address);
	}
}
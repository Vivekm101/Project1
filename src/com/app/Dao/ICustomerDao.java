package com.app.Dao;

import java.util.List;

import com.app.entity.Customers;

public interface ICustomerDao {
	public List<Customers> getCustomer(int mrId);
	public void saveCustomer(int mrId,String fname,String lname,String email);
	public Customers updateCustomer(int customerId) ;
	public void updateSaveCustomer(Customers customer,int mrId,int customerId);	
	public void deleteCustomer(int customerId);
	

}

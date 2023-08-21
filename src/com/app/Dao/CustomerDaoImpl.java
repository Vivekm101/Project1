package com.app.Dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customers;
import com.app.entity.SalesMan;
@Repository
public class CustomerDaoImpl implements ICustomerDao{
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Customers> getCustomer(int mrId) {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.getCurrentSession();
 Query query=currentsession.createQuery("from Customers where mr_id=:n");
 query.setParameter("n", mrId);
		
		List<Customers> list=query.getResultList();
		return list;
	}

	@Override
	public void saveCustomer(int mrId,String fname,String lname,String email) {
		// TODO Auto-generated method stub
		SalesMan mr=new SalesMan(mrId);
		Customers customers=new Customers(fname, lname, email);
		customers.setMr(mr);
		Session currentsession=sessionfactory.getCurrentSession();
		currentsession.save(customers);
//		currentsession.getTransaction().commit();
//		currentsession.close();
		
		
	}

	@Override
	public Customers updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.getCurrentSession();
		Customers customers=new Customers();
		customers=currentsession.get(Customers.class,customerId);
//		currentsession.getTransaction().commit();
//		currentsession.close();
		return customers;
		
	}

	@Override
	public void updateSaveCustomer(Customers customer, int mrId,int customerId) {
		// TODO Auto-generated method stub
		SalesMan mr=new SalesMan(mrId);
		customer.setCid(customerId);
		customer.setMr(mr);
		Session currentsession=sessionfactory.getCurrentSession();
		currentsession.saveOrUpdate(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.getCurrentSession();
		  Query query=currentsession.createQuery("delete from Customers where cid=:n");  
			query.setParameter("n", customerId);
	//		currentsession.beginTransaction();
			query.executeUpdate();
	}

}

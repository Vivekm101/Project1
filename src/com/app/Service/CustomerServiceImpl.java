package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.ICustomerDao;
import com.app.entity.Customers;
@Service
@Component("test")
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDao customerdao;

	@Override
	@Transactional
	public List<Customers> getCustomer(int mrId) {
		// TODO Auto-generated method stub
		List<Customers> list=customerdao.getCustomer(mrId);
		return list;
	}

	@Override
	@Transactional
	public void saveCustomers(int mrId,String fname,String lname,String email) {
		// TODO Auto-generated method stub
		customerdao.saveCustomer(mrId, fname, lname, email);
		
	}

	@Override
	@Transactional
	public Customers updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		return customerdao.updateCustomer(customerId);
	}

	@Override
	@Transactional
	public void updateSaveCustomer(Customers customer, int mrId,int customerId) {
		// TODO Auto-generated method stub
		customerdao.updateSaveCustomer(customer, mrId,customerId);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerdao.deleteCustomer(customerId);
		
	}

}

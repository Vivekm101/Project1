package com.app.Dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.SalesMan;

@Repository
public class HRDaoImpl implements IHRDao {
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<SalesMan> getSalesMan() {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.getCurrentSession();
		Query query=currentsession.createQuery("from SalesMan");
        List<SalesMan> salesman=query.getResultList();
		
		return salesman;
	}

	@Override
	public void saveSalesMan(SalesMan salesman) {
		// TODO Auto-generated method stub
		Session currentsession=sessionfactory.getCurrentSession();
		currentsession.save(salesman);
	}

}

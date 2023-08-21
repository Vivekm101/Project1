package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.IHRDao;
import com.app.entity.SalesMan;

@Service
public class HRServiceImpl implements IHRService {
	@Autowired
	private IHRDao hrdao;

	@Override
	@Transactional
	public List<SalesMan> getSalesMan() {
		// TODO Auto-generated method stub
		List<SalesMan> salesmans=hrdao.getSalesMan();
		
		return salesmans;
	}

	@Override
	@Transactional
	public void saveSalesMan(SalesMan salesman) {
		// TODO Auto-generated method stub
		hrdao.saveSalesMan(salesman);
		
	}

}

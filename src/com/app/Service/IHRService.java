package com.app.Service;

import java.util.List;

import com.app.entity.SalesMan;

public interface IHRService {
	public List<SalesMan> getSalesMan();
	public void saveSalesMan(SalesMan salesman);

}

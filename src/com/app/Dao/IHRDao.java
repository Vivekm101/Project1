package com.app.Dao;

import java.util.List;

import com.app.entity.SalesMan;

public interface IHRDao {
	public List<SalesMan> getSalesMan();
	public void saveSalesMan(SalesMan salesman);

}

package com.application.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.application.dao.WebDao;
import com.application.application.entities.Web;

@Service
public class WebServiceImpl implements WebService{

	@Autowired
	private WebDao webDao;
	
	public List<Web> getAllSeries() {
		return webDao.findAll();
		
	}

	public Web getSeriesById(String id) {
		return webDao.getById(id);
	}

	public Web getSeriesByName(String name) {
		return webDao.getById(name);
	}

	public void addSeries(Web web) {
		webDao.save(web);
		
	}

	public void updateSeries(Web web) {
		webDao.save(web);
		
	}

	public String deleteSeries(String id) {
		Web entity=webDao.getById(id);
		webDao.delete(entity);
		return "Successfully Deleted!";
	}

}

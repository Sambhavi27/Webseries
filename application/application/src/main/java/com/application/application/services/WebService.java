package com.application.application.services;

import java.util.List;




import com.application.application.entities.Web;

public interface WebService {

	public List<Web> getAllSeries();
	public Web getSeriesById(String id);
	public Web getSeriesByName(String name);
	public void addSeries(Web web);
	public void updateSeries(Web web);
	public String deleteSeries(String id);
}

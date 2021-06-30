package com.application.application.controllers;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.application.application.entities.Web;
import com.application.application.services.WebService;

	@RestController
	public class WebController {


	
	
		@Autowired
		private WebService webService;
		
		@GetMapping("/series")
		public List<Web> getAllSeries(){
			
			return this.webService.getAllSeries();
			
			
		}
		
		@GetMapping("/series/id/{id}")
		public Web getSeriesById(@RequestParam String id){
			
			return this.webService.getSeriesById(id);
			
			
		}
		
		@GetMapping("/series/name/{name}")
		public Web getSeriesByName(@PathVariable("name") String name){
			
			return this.webService.getSeriesByName(name);
			
			
		}
		
		
		
		
		@PostMapping("/addSeries")
		public void addSeries(@RequestBody Web webModel) {
			this.webService.addSeries(webModel);
		}
		
		@PutMapping("/update")
		public void updateSeries(@RequestBody  Web webModel) {
			this.webService.addSeries(webModel);
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteSeries(@PathVariable String id) {
			
				return this.webService.deleteSeries(id);
			
		
	}

}

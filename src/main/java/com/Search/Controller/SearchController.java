package com.Search.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Search.Model.SearchModel;
import com.Search.Service.SearchService;


@RestController
@RequestMapping("/search")
@CrossOrigin("http://localhost:3000")
public class SearchController {
	@Autowired
	SearchService searchservice;

	public SearchController(SearchService searchservice) {
		super();
		this.searchservice = searchservice;
	}
	
	
	@GetMapping("/get/pro/{name}")
	public List<SearchModel> searchproduct(@PathVariable("name") String name){
		
		return searchservice.searchproduct(name);
	}
	

}

package com.Search.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Search.Model.SearchModel;

public interface SearchRepository extends JpaRepository<SearchModel, Long>{
	
	@Query(value = "select * from products.productdetails where name like %?% ;", nativeQuery = true)
	List<SearchModel> searchproduct(String name);
}

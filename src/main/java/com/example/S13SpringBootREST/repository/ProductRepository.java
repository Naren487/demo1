package com.example.S13SpringBootREST.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.S13SpringBootREST.entity.*;
public interface ProductRepository extends CrudRepository<Product,Integer> {
//	List<Product> findByName(String name);
//	
//	List<Product> findByPrice(double price);
//	List<Product> findByNameAndPrice(String name,double price);
}

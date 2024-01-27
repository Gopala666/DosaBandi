package com.dosabandi.dosabandi.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	ProductRepository repository;
	
	public ProductService(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Product> getProducts() {
		
		return repository.findAll();
	}

	public Product getProduct(Integer pid) {
		// TODO Auto-generated method stub
		return repository.findById(pid).get();
	}

}

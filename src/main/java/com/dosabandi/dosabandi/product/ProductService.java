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
		return repository.findById(pid).get();
	}

	public Product addProduct(Product product) {
		return repository.save(product);
	}

	public Product updateProduct(int id, Product product) {
		Product productToUpdate = repository.findById(id).orElseThrow();
		productToUpdate.setProductName(product.getProductName());
		productToUpdate.setPrice(product.getPrice());
		productToUpdate.setDescription(product.getDescription());
		productToUpdate.setUrl(product.getUrl());
        return repository.save(productToUpdate);
    }

    public void deleteProduct(int id) {
    	repository.deleteById(id);
    }

}

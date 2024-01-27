package com.dosabandi.dosabandi.product;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return productService.getProducts();
	}
	@GetMapping("/products/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		
		return productService.getProduct(pid);
	}
}

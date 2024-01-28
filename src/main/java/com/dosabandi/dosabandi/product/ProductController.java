package com.dosabandi.dosabandi.product;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

	ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping
	public List<Product> getAllProducts() {		
		return productService.getProducts();
	}
	@PostMapping
	public Product addProduct(@RequestBody Product product) {		
		return productService.addProduct(product);
	}
	@GetMapping("/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		
		return productService.getProduct(pid);
	}	
	@PutMapping("/{pid}")
	public void updateProduct(@PathVariable Integer pid, @RequestBody Product product) {		
		productService.updateProduct(pid,product);
	}
	@DeleteMapping("/{pid}")
    public void deleteProduct(@PathVariable int pid){
		productService.deleteProduct(pid);
    }
	
	@GetMapping("/products/test")
	public String test() {
		
		return "Success";
	}
}

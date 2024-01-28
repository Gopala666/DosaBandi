package com.dosabandi.dosabandi.product;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@Column
	private String productName;
	@Column
	private BigDecimal price;
	@Column
	private String description;
	@Column
	private String url;
	
	public Product() {
	}
	public Product(Integer pid, String productName, BigDecimal price, String description, String url) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.url = url;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + ", description="
				+ description + ", url=" + url + "]";
	}
}

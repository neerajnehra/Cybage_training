package com.example;

import java.util.List;

public interface ProductService {
	public void addProduct(Product product);
	public List<Product> displayProduct();
	public String deleteProductById(int id);
	public String updateProductById(Product product);
	public Product findProductById(int id);
}

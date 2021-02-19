package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository pr;
	
	public void addProduct(Product product) {
		pr.save(product);
	}
	
	public List<Product> displayProduct(){
		return pr.findAll();
	}
	
	public String deleteProductById(int id) {
		pr.deleteById(id);
		return "Product with " + id + " has been deleted.";
	}
	
	public String updateProductById(Product product) {
		pr.save(product);
		return "Product with " + product.getId() + " has been updated.";
	}
	
	public Product findProductById(int id) {
		return pr.findById(id).get();
	}
}

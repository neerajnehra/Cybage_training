package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@Autowired
	ProductService ps;

	@RequestMapping(path = "/")
	public String showIndex(Model model) {
		List<Product> products = ps.displayProduct();
		model.addAttribute("product", products);
		return "index";
	}

	// add product
	@RequestMapping(path = "/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "add";
	}

	@RequestMapping(path = "/saveProduct", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		ps.addProduct(product);
		return "redirect:/";
	}

	// For deleting product by id
	@RequestMapping(path = "/deleteProduct/{id}")
	public String deleteProductById(@PathVariable int id) {
		ps.deleteProductById(id);
		return "redirect:/";
	}

	// Update form
	@RequestMapping(path = "/updateProduct/{id}")
	public String updateProduct(Model model, @PathVariable int id) {
		Product product = ps.findProductById(id);
		model.addAttribute("product", product);
		return "update";
	}

	// For updating employee by id

	@RequestMapping(path = "/updateProduct")
	public String updateProductById(@ModelAttribute("newProduct") Product product) {
		System.out.println("In upProduct");
		ps.updateProductById(product);
		return "redirect:/";
	}

}

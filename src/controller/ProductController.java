package controller;

import java.util.ArrayList;

import data.ProductRepository;
import models.Product;


public class ProductController {
	
	ProductRepository productRepository = new ProductRepository();
	
	public String createProduct(String id , String brand, String name, double price, int quantity) {
		
		if(brand.trim().length() <= 3) {
			return "La marca debe ser mayor a 3 caracteres";
	    }
		if(name.trim().length() <= 3 ) {
			return "El nombre debe ser mayor a 3 caracteres";
		}
		if(price < 500 ) {
			return "El precio debe ser mayor a 500";
		}
		if(quantity < 1) {
			return "la cantidad debe ser mayor a  0";
		}
		 
	Product product = new Product(id ,brand, name, price, quantity);
	boolean result = productRepository.createProduct(product);
	
	if (result) {
		System.out.println("");
		return "El producto se ha creado con exito";
	} else {
		System.out.println("");
		return "Hubo un error al crear el Producto";
		}
		
	}
	
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = productRepository.getAll();
		return products;
		
	}
	
	public Product searchProduct(String id) {
		Product product = productRepository.findProductById(id);
		return product;	
	}
	
	public String productUpdate(Product product, String id, String brand, String name, double price, int quantity) {
		
		Product productUpdate = new Product(id, brand ,name ,price ,quantity );
		productRepository.productUpdate(product, productUpdate);
		
		return null;
	}
	
	public boolean deleteProduct(String id) {
			
			return productRepository.deleteProduct(id);
			
	}
	
	

}

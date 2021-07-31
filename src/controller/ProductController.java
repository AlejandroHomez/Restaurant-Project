package controller;

import data.ProductRepository;
import models.Product;


public class ProductController {
	
	ProductRepository productRepository = new ProductRepository();
	
	public String createProduct(String brand, String name, double price, int quantity) {
		
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
		
	Product produt = new Product(brand, name, price, quantity);
	boolean result = productRepository.createProduct(produt);
	
	if (result) {
		System.out.println("");
		return "El producto se ha creado con exito";
	} else {
		System.out.println("");
		return "Hubo un error al crear el Producto";
		}
		
	}
	
	

}

package data;

import java.util.ArrayList;

import models.Product;

public class ProductRepository {
	
private ArrayList<Product> products = new ArrayList<Product>();
	
	public boolean createProduct (Product product) {
		
		products.add(product);
		
		return true;
	}

}

package data;

import java.util.ArrayList;

import models.Client;
import models.Product;

public class ProductRepository {
	
private ArrayList<Product> products = new ArrayList<Product>();
	
	public boolean createProduct (Product product) {
		
		products.add(product);
		
		return true;
	}
	
	public ArrayList<Product> getAll() {
		return products;
	}
	
	public Product findProductById (String name) {
		
		for ( int i = 0 ; i < products.size() ; i++) {
			
			Product product = products.get(i);
				
			if (product.getName().equals(name)) {
				return product;
				}
			
		}
		return null;
		
		
	}
	
	public boolean productUpdate(Product product , Product clientUpdate) {
		
		int position = products.indexOf(product);
		products.set(position, clientUpdate);
		
		return true;
	}
	
	public boolean deleteProduct(String id) {
		for(int i = 0 ; i < products.size(); i++) {
			Product product = products.get(i);
			if(product.getName().equals(id)) {
				products.remove(i);
				return true;
			}
		}
		return false;
	}

}

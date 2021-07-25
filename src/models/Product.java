package models;

public class Product {
	
	
	// Attributes
	
	private String brand;
	private String name;
	private double price;
	private int quiantity;
	
	//Methods
	
	public Product(String brand, String name, double price, int quiantity) {
		
		this.brand     = brand;
		this.name      = name;
		this.price     = price;
		this.quiantity = quiantity;
		
	}
	
	//Gets

	public String getBrand() {
		return brand;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuiantity() {
		return quiantity;
	}
	
	//Sets
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuiantity(int quiantity) {
		this.quiantity = quiantity;
	}
	

	
}

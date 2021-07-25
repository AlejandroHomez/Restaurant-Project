package models;

public class Recipe {
	
	//Attributes

	private String name;
	private double price;
	
	
	//Methods
	
	public Recipe(String name	, double price){
		this.name  = name;
		this.price = price;
	}
	
	
	//Gets
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	//Sets
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


}

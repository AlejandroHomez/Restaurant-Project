package models;

public class Recipe {
	
	//Attributes
	
	private String id;
	private String name;
	private double price;
	
	
	//Methods
	
	public Recipe(String id, String name, double price){
		this.id = id;
		this.name  = name;
		this.price = price;
	}
	
	
	//Gets
	public String getId( ) {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	//Sets
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Recipe[ ID: " + id +" *Nombre: " + name + " *Precio: " +  price + " ]";
	}
	


}

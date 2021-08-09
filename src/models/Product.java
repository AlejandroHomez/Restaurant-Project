package models;

public class Product {
	
	
	// Attributes
	private String id;
	private String brand;
	private String name;
	private double price;
	private int quiantity;
	
	//Methods
	
	public Product(String id, String brand, String name, double price, int quiantity) {
		this.id 	   = id;
		this.brand     = brand;
		this.name      = name;
		this.price     = price;
		this.quiantity = quiantity;
		
	}
	
	//Gets
	public String getId() {
		return id;
	}

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
	
	public void setId(String id) {
		this.id = id;
	}
	
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
	
	
	@Override
	public String toString() {
		return "Product[ *ID: " + id +  " *Marca: " + brand + " *Nombre: " +  name + " *Precio: " + price + " *Cantidad: " + quiantity+ " ]";
	}
	

	
}

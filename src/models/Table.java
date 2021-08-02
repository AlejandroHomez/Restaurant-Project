package models;

public class Table {
	
	//Attributes
	
	private String tableNumber;
	private int capacity;
	private String location;
	
	//Methods
	
	public Table(String tableNumber, int capacity, String location){
		this.tableNumber = tableNumber;
		this.capacity    = capacity;
		this.location    = location;
	}
	
	//Gets
	
	public String getNumberTable() {
		return tableNumber;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getLocation() {
		return location;
	}
	
	//Sets
	
	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Table[ *Numero de mesa: " + tableNumber + " *Capacidad: " +  capacity + " *Ubicacion: "+ location + " ]";
	}
	
	


}

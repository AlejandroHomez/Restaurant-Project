package ui;

import java.util.Scanner;

import controller.TableController;

public class TableScreen {
	
	TableController tableController = new TableController();
	
	public void crateTable() {
		
	String tableNumber;
	int capacity;
	String location;
	
	Scanner sc = new Scanner(System.in);
		
	 System.out.println("");
	 System.out.println("----------------CREAR MESA----------------");
	 System.out.println("");
	 
	 System.out.println("Ingrese el numero de la mesa: ");
	 tableNumber = sc.nextLine();
	 System.out.println("Ingrese la capicidad de personas que tiene la mesa: ");
	 capacity = Integer.parseInt(sc.nextLine());
	 System.out.println("Ingrese la ubicacion de la mesa: ");
	 location = sc.nextLine();
	 
	 
	 String result = tableController.crateTable(tableNumber, capacity, location);
	 System.out.println(result);
	 
	}

}

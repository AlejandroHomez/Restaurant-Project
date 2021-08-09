package ui;

import java.util.ArrayList;
import java.util.Scanner;


import controller.TableController;
import models.Table;

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
	
	public void listTables() {
		ArrayList<Table> tables = tableController.getAll();
		
		if(tables.size() == 0 ) {
			System.out.println("No hay mesas creadas en la base de datos");
		}
		
		for(int i = 0 ; i < tables.size(); i ++) {
			Table table = tables.get(i);
			System.out.println(table.toString());
		}
	}
	
	public void searchTable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de la mesa para buscar");
		String tableNumber = sc.nextLine();
		
		if(tableNumber != null) {
			System.out.println(tableNumber.toString());
		} else {}
			System.out.println("No hay ninguna mesa creada");
	}
	
	public void updateTable() {
		
		Scanner scUpdate = new Scanner(System.in);
		System.out.println("Ingrese el número de la mesa que desea actualizar");
		String id = scUpdate.nextLine();
		
		Table table = tableController.searchTable(id);
		
		if(table != null) {
			
			String tableNumber;
			int capacity;
			String location;
			
			Scanner sc = new Scanner(System.in);
				
			 System.out.println("");
			 System.out.println("----------------ACTUALIZAR MESA----------------");
			 System.out.println("");
			 
			 System.out.println("Ingrese el numero de la mesa: ");
			 tableNumber = sc.nextLine();
			 System.out.println("Ingrese la capicidad de personas que tiene la mesa: ");
			 capacity = Integer.parseInt(sc.nextLine());
			 System.out.println("Ingrese la ubicacion de la mesa: ");
			 location = sc.nextLine();
			 
			 
			 String result = tableController.updateTable(table, tableNumber, capacity, location);
			 
			 System.out.println("La mesa se actualizo con exito");
			}else {
			System.out.println("No se encontro ninguna mesa con el numero: " + id);
			}
			
		}
	
	

	public void deleteTable() {
		
		Scanner scDeleted = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la receta que desea eliminar:");
		String id = scDeleted.nextLine();
		
		Boolean tabletDeleted = tableController.deleteTable(id);
		
		if (tabletDeleted) {
			System.out.println("Se eliminó la mesa con exito");
		} else {
			System.out.println("No se encontró la mesa con el numero: " + scDeleted);
		}
	}
		
		
		

}

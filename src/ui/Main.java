package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Inicio el programa");
		System.out.println("");
		
		//CLIENTS
		System.out.println("----------------CLIENTES----------------");
		System.out.println("");
		
		//News Clients
		Client[] newClient = new Client[4];
		newClient[1] = new Client("Alejandro", "Homez", "1110585515", false);
		newClient[2] = new Client("Sebastian", "Hernandez", "123456785", false);
		newClient[3] = new Client("Julian", "Botero", "1110567110", true);
		//Show Clients
		showClient(newClient , 1);
		showClient(newClient , 2);
		showClient(newClient , 3);
		//Edit Clients
		newClient[1].setLastName("Edinson");
		newClient[2].setHasChildren(true);
		newClient[3].setLastName("Rodriguez");
		//Shows Clients
		System.out.println("****Clientes modificados****");
		System.out.println("");
		showClient(newClient , 1);
		showClient(newClient , 2);
		showClient(newClient , 3);
		
		//PRODUCTS
		System.out.println("----------------PRODUCTOS----------------");
		System.out.println("");
		
		//News Products
		Product[] newProduct = new Product[4];
		newProduct[1] = new Product("Zenu", "Salchicha" , 4800, 5);
		newProduct[2] = new Product("Margarita", "Papas de pollo" , 2000, 10);
		newProduct[3]= new Product("Nectar", "Nectar rojo" , 40000, 3);
		//Show products
		showProduct(newProduct, 1);
		showProduct(newProduct, 2);
		showProduct(newProduct, 3);
		//Edit products
		newProduct[1].setPrice(5000);
		newProduct[2].setQuiantity(50);
		newProduct[3].setBrand("Nectar premium");
		//Show products
		System.out.println("****Productos modificados****");
		System.out.println("");
		showProduct(newProduct, 1);
		showProduct(newProduct, 2);
		showProduct(newProduct, 3);
		
		//RECIPE
		System.out.println("----------------RECETAS----------------");
		System.out.println("");
		
		//News Recipes
		Recipe[] newRecipe = new Recipe[4]; 
		newRecipe[1] = new Recipe("Bandeja Paisa", 15000);
		newRecipe[2] = new Recipe("Arroz Chino", 20000);
		newRecipe[3] = new Recipe("Ajiaco Santafereño", 18000);
		//Show Recipes
		showRecipe(newRecipe , 1);
		showRecipe(newRecipe , 2);
		showRecipe(newRecipe , 3);
		//Edit Recipes
	    newRecipe[1].setPrice(16000);
	    newRecipe[2].setPrice(22000);
	    newRecipe[3].setName("Mojarra Frita");
	    //Show Recipes
	    System.out.println("****Recetas modificadas****");
		System.out.println("");
		showRecipe(newRecipe , 1);
		showRecipe(newRecipe , 2);
		showRecipe(newRecipe , 3);
  		
  		//TABLES
  		System.out.println("----------------MESAS----------------");
		System.out.println("");
		
		//News Tables
		Table[] newTable = new Table[4];
		newTable[1] = new Table("4" , 6 ,"Salon3");
		newTable[2] = new Table("5" , 2 ,"Salon1");
		newTable[3] = new Table("6" , 4 ,"Salon2");
		//Show Tables
		showTables(newTable, 1);
		showTables(newTable, 2);
		showTables(newTable, 3);
		//Edit Tables
		newTable[1].setCapacity(4);
		newTable[2].setLocation("Salon principal");
		newTable[3].setTableNumber("8");
		//show Tables
		System.out.println("****Mesas modificadas****");
		System.out.println("");
		showTables(newTable, 1);
		showTables(newTable, 2);
		showTables(newTable, 3);
		
		
	}
	
	//Clients
	public static void showClient(Client[] newClient, int i) {
		System.out.println("Cliente #" + i);
		System.out.println("Nombre: " + newClient[i].getName());
		System.out.println("Apellido: " + newClient[i].getLastName());
		System.out.println("Documento: " + newClient[i].getIdentityDocument());
		System.out.println("Tiene hijos (true/false): " + newClient[i].getHasChildren());
		System.out.println("");
		
}
	//Products
	public static void showProduct(Product[] newProdutc , int i) {
		System.out.println("Producto #" + i);
		System.out.println("Marca: " + newProdutc[i].getBrand());
		System.out.println("Nombre: " + newProdutc[i].getName());
		System.out.println("Precio: " + newProdutc[i].getPrice());
		System.out.println("Cantidad: " + newProdutc[i].getQuiantity());
		System.out.println("");	
	}
	//Recipes
	public static void showRecipe(Recipe[] newRecipe , int i) {
		System.out.println("Receta #" + i);
		System.out.println("Nombre: " + newRecipe[i].getName());
		System.out.println("Precio: " + newRecipe[i].getPrice());
		System.out.println("");	
	}
	//Tables
	public static void showTables(Table[] newTable, int i ) {
		System.out.println("Mesa #" + newTable[i].getNumberTable());
		System.out.println("Capacidad: " + newTable[i].getCapacity());
		System.out.println("Ubicacion: " + newTable[i].getLocation());
		System.out.println("");	
	}
}






package ui;

import java.util.Scanner;

import controller.ProductController;

public class ProductScreen {
	
	ProductController productoController = new ProductController();
	
	public void createProducto() {
		
	 String brand;
	 String name;
	 double price;
	 int quiantity;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("");
	 System.out.println("----------------CREAR PRODUCTO----------------");
	 System.out.println("");
		
		System.out.println("Ingrese la marca: ");
		brand = sc.nextLine();
		System.out.println("Ingrese el nombre: ");
		name = sc.nextLine();
		System.out.println("Ingrese el valor: ");
		price = sc.nextDouble();
		System.out.println("Ingrese la cantidad: ");
		quiantity = sc.nextInt();
	 
	String result = productoController.createProduct(brand, name, price, quiantity);
	System.out.println(result);
	}

}

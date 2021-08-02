package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProductController;
import models.Product;

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
	
	
	public void listProducts() {
		ArrayList<Product> products = productoController.getProducts();
		
		if(products.size() == 0) {
			System.out.println("No hay productos creados en la base de datos");
			return;
		}
		
		for(int i = 0 ; i < products.size(); i ++) {
			Product product = products.get(i);
			System.out.println(product.toString());
		}
	}
	
	public void searchProduct () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un nombre del producto para buscar");
		
		String name = sc.nextLine();
		
		Product product = productoController.searchProduct(name);
		
		if(product != null) {
			System.out.println(product.toString());
		} else  {
			System.out.println("No existe un producto con este nombre");
		}
		
		
	}

}

package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProductController;
import models.Client;
import models.Product;

public class ProductScreen {
	
	ProductController productController = new ProductController();
	
	public void createProduct() {
		
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
		price = Double.parseDouble(sc.nextLine());
		System.out.println("Ingrese la cantidad: ");
		quiantity = Integer.parseInt(sc.nextLine());
	 
	String result = productController.createProduct(brand, name, price, quiantity);
	
	System.out.println(result);
	
	}
	
	
	public void listProducts() {
		ArrayList<Product> products = productController.getProducts();
		
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
		
		Product product = productController.searchProduct(name);
		
		if(product != null) {
			System.out.println(product.toString());
		} else  {
			System.out.println("No existe un producto con este nombre");
		}
		
		
	}
	
	public void updateProduct() {

		Scanner scUpdate = new Scanner(System.in);
		System.out.println("Digite el nombre del producto que desea actualizar:");
		String nameId = scUpdate.nextLine();
		
		Product product = productController.searchProduct(nameId);
		
		if(product != null ) {
		
			 String brand;
			 String name;
			 double price;
			 int quantity;
			 
			 Scanner sc = new Scanner(System.in);
			 
			System.out.println("");
			System.out.println("----------------ACTUALIZAR PRODUCTO----------------");
		    System.out.println("");
			
			System.out.println("Ingrese la marca: ");
			brand = sc.nextLine();
			System.out.println("Ingrese el nombre: ");
			name = sc.nextLine();
			System.out.println("Ingrese el valor: ");
			price = Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la cantidad: ");
			quantity = Integer.parseInt(sc.nextLine()) ;
		 
			String result = productController.productUpdate(product, brand, name, price, quantity);
			
			System.out.println("Se actualizo el Producto con exito");
			}else {
			System.out.println("No se encontro el producto con el nombre: " + nameId);
			}
			
		}
	
	public void deleteProduct() {
		
		Scanner scDeleted = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto que desea eliminar:");
		String id = scDeleted.nextLine();
		
		Boolean productDeleted = productController.deleteProduct(id);
		
		if (productDeleted ) {
			System.out.println("Se eliminó el producto con exito");
		} else {
			System.out.println("No se encontró el producto con el nombre: " + scDeleted);
		}
	}
		
}


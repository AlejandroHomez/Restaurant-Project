package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProductController;
import models.Client;
import models.Product;

public class ProductScreen {
	
	ProductController productController = new ProductController();
	
	public void createProduct() {
	
	 String id;
	 String brand;
	 String name;
	 double price;
	 int quiantity;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("");
	 System.out.println("----------------CREAR PRODUCTO----------------");
	 System.out.println("");
		
	 	System.out.println("Ingrese el id: ");
		id = sc.nextLine();
		System.out.println("Ingrese la marca: ");
		brand = sc.nextLine();
		System.out.println("Ingrese el nombre: ");
		name = sc.nextLine();
		System.out.println("Ingrese el valor: ");
		price = Double.parseDouble(sc.nextLine());
		System.out.println("Ingrese la cantidad: ");
		quiantity = Integer.parseInt(sc.nextLine());
	 
	String result = productController.createProduct(id,brand, name, price, quiantity);
	
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
		
		System.out.println("Ingrese el id del producto para buscar");
		String id = sc.nextLine();
		
		Product product = productController.searchProduct(id);
		
		if(product != null) {
			System.out.println(product.toString());
		} else  {
			System.out.println("No existe un producto con este nombre");
		}
		
		
	}
	
	public void updateProduct() {

		Scanner scUpdate = new Scanner(System.in);
		System.out.println("Digite el id del producto que desea actualizar:");
		String idUpdate = scUpdate.nextLine();
		
		Product product = productController.searchProduct(idUpdate);
		
		if(product != null ) {
				
			 String id;
			 String brand;
			 String name;
			 double price;
			 int quantity;
			 
			 Scanner sc = new Scanner(System.in);
			 
			System.out.println("");
			System.out.println("----------------ACTUALIZAR PRODUCTO----------------");
		    System.out.println("");
			
		    System.out.println("Ingrese el id: ");
			id = sc.nextLine();
			System.out.println("Ingrese la marca: ");
			brand = sc.nextLine();
			System.out.println("Ingrese el nombre: ");
			name = sc.nextLine();
			System.out.println("Ingrese el valor: ");
			price = Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la cantidad: ");
			quantity = Integer.parseInt(sc.nextLine()) ;
		 
			String result = productController.productUpdate(product, id, brand, name, price, quantity);
			
			System.out.println("Se actualizo el Producto con exito");
			}else {
			System.out.println("No se encontro el producto con el id: " + idUpdate);
			}
			
		}
	
	public void deleteProduct() {
		
		Scanner scDeleted = new Scanner(System.in);
		System.out.println("Ingrese el id del producto que desea eliminar:");
		String id = scDeleted.nextLine();
		
		Boolean productDeleted = productController.deleteProduct(id);
		
		if (productDeleted ) {
			System.out.println("Se eliminó el producto con exito");
		} else {
			System.out.println("No se encontró el producto con el id: " + scDeleted);
		}
	}
		
}


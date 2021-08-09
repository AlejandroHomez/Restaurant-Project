package ui;

import java.util.Scanner;

public class MenuScreen {
	
	public int showMenuOptionsPrincipal() {
		
		Scanner scPrincipal = new Scanner(System.in);
		System.out.println("");
		System.out.println("Seleccione una opción del menú");
		System.out.println("--------------------");
		System.out.println("1.Tratar Clientes");
		System.out.println("2.Tratar Producto");
		System.out.println("3.Tratar Receta");
		System.out.println("4.Tratar Mesa");
		System.out.println("");
		System.out.println("8.Salir");
		
		try {
			int optionSelected = Integer.parseInt(scPrincipal.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
		
	}

		
	
	
	public int showMenuOptionsClients() {
		
		Scanner sItem = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("1.Crear Cliente");
		System.out.println("2.Listar Cliente");
		System.out.println("3.Buscar Cliente");
		System.out.println("4.Atualizar Cliente");
		System.out.println("5.Eliminar Cliente");
		System.out.println("6.Volver");
		
		try {
			int optionSelected = Integer.parseInt(sItem.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
	}
	
	public int showMenuOptionsProducts() {
		
		Scanner sItem = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("1.Crear Producto");
		System.out.println("2.Listar Producto");
		System.out.println("3.Buscar Producto");
		System.out.println("4.Atualizar Producto");
		System.out.println("5.Eliminar Producto");
		System.out.println("6.Volver");
		
		try {
			int optionSelected = Integer.parseInt(sItem.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
	}
	
	public int showMenuOptionsRecipes() {
		
		Scanner sItem = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("1.Crear Receta");
		System.out.println("2.Listar Receta");
		System.out.println("3.Buscar Receta");
		System.out.println("4.Atualizar Receta");
		System.out.println("5.Eliminar Receta");
		System.out.println("6.Volver");
		
		try {
			int optionSelected = Integer.parseInt(sItem.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
	}
	
	
	public int showMenuOptionsTables() {
		
		Scanner sItem = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("1.Crear Mesa");
		System.out.println("2.Listar Mesa");
		System.out.println("3.Buscar Mesa");
		System.out.println("4.Atualizar Mesa");
		System.out.println("5.Eliminar Mesa");
		System.out.println("6.Volver");
		
		try {
			int optionSelected = Integer.parseInt(sItem.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
	}
	
	
	
	
}

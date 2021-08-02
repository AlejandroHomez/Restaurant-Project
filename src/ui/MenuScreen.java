package ui;

import java.util.Scanner;

public class MenuScreen {
	
	public int showMenuOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Seleccione la opcion que desea ralizar");
		System.out.println("--------------------");
		System.out.println("1.Crear Cliente");
		System.out.println("2.Listar Cliente");
		System.out.println("9.Buscar Cliente");
		System.out.println("--------------------");
		System.out.println("3.Crear Producto");
		System.out.println("4.Listar Producto");
		System.out.println("10.Buscar Producto");
		System.out.println("--------------------");
		System.out.println("5.Crear Receta");
		System.out.println("6.Listar Receta");
		System.out.println("11.Buscar Receta");
		System.out.println("--------------------");
		System.out.println("7.Crear Mesa");
		System.out.println("8.Listar Mesa");
		System.out.println("12.Buscar Mesa");
		System.out.println("--------------------");

		
		try {
			int optionSelected = Integer.parseInt(sc.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
		

		
	}

}

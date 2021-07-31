package ui;

import java.util.Scanner;

import controller.RecipeController;

public class RecipeScreen {
	
	RecipeController recipeController = new RecipeController();
	
	public void createRecipe() {
	
	String name;
	double price;
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("");
	 System.out.println("----------------CREAR RECETA----------------");
	 System.out.println("");
	 
	 System.out.println("Ingrese el nombre de la Receta: ");
	 name = sc.nextLine();
	 System.out.println("Ingrese el precio: ");
	 price = sc.nextDouble();
	 
	 
	 String result = recipeController.createRecipe(name, price);
	 System.out.print(result);
	 
	 
	}
	

}

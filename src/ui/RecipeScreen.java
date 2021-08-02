package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.RecipeController;
import models.Recipe;

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
	
	public void listRecipes() {
		ArrayList<Recipe> recipes = recipeController.getAll();
		
		if(recipes.size() == 0) {
			System.out.println("No hay recetas creadas en la base de datos");
		}
		
		for(int i = 0 ; i < recipes.size(); i ++) {
			Recipe recipe = recipes.get(i);
			System.out.println(recipe.toString());
		}
	}
	
	public void searchRecipe() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Ingrese el nombre de la receta para buscar");
		String name = sc.nextLine();
		Recipe recipes = recipeController.searchRecipe(name);
		
		if(recipes != null) {
			System.out.println(recipes.toString());
		} else  {
			System.out.println("No existe ninguna receta con este nombre");
		}
	}
	

}

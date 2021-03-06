package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.RecipeController;
import models.Recipe;

public class RecipeScreen {
	
	RecipeController recipeController = new RecipeController();
	
	public void createRecipe() {
	
	String id;
	String name;
	double price;
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("");
	 System.out.println("----------------CREAR RECETA----------------");
	 System.out.println("");
	 
	 System.out.println("Ingrese el id de la Receta: ");
	 id = sc.nextLine();
	 System.out.println("Ingrese el nombre de la Receta: ");
	 name = sc.nextLine();
	 System.out.println("Ingrese el precio: ");
	 price = Double.parseDouble(sc.nextLine());
	 
	 
	 String result = recipeController.createRecipe(id, name, price);
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
		System.out.println("Ingrese el id de la receta para buscar");
		String id = sc.nextLine();
		Recipe recipes = recipeController.searchRecipe(id);
		
		if(recipes != null) {
			System.out.println(recipes.toString());
		} else  {
			System.out.println("No existe ninguna receta con el id: " + id);
		}
	}
	
	public void updateRecipe() {
		
		Scanner scUpdate = new Scanner(System.in);
		System.out.println("Ingrese el id de la receta que desea buscar");
		String idUpdate = scUpdate.nextLine();
		
		Recipe recipe = recipeController.searchRecipe(idUpdate);
		
		if(recipe != null) {
			
		String id;
		String name;
		double price;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("");
		 System.out.println("----------------ACTUALIZAR RECETA----------------");
		 System.out.println("");
		 
		 System.out.println("Ingrese el id de la Receta: ");
		 id = sc.nextLine();
		 System.out.println("Ingrese el nombre de la Receta: ");
		 name = sc.nextLine();
		 System.out.println("Ingrese el precio: ");
		 price = Double.parseDouble(sc.nextLine());
		 
		 
		 String result = recipeController.updateRecipes(recipe, id, name, price);
		 
		 System.out.print("La Receta se actualizo con exito");
		} else {
		 System.out.print("No se encontro ninguna receta con el nombre: " + idUpdate);
		}		
	}
		
	public void deleteRecipe() {
		
		Scanner scDeleted = new Scanner(System.in);
		System.out.println("Ingrese el id de la receta que desea eliminar:");
		String id = scDeleted.nextLine();
		
		Boolean recipeDeleted = recipeController.deleteRecipe(id);
		
		if (recipeDeleted ) {
			System.out.println("Se elimin? la receta con exito");
		} else {
			System.out.println("No se encontr? la receta con el id: " + id);
		}
	}
		
}

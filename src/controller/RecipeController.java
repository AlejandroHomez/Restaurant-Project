package controller;

import java.util.ArrayList;

import data.RecipeRepository;

import models.Recipe;

public class RecipeController {
	
	RecipeRepository recipeRepository = new RecipeRepository();
	
	
	public String createRecipe(String id, String name, double price) {
		
		if(id.trim().length() >= 10) {
			return "El id de la receta debe ser menor a 10 cararcaters";
		}
		if(name.trim().length() <= 3) {
			return "El nombre de la receta debe ser mayor a 3 caracteres";
		}
		if(name.trim().length() >= 30) {
			return "El nombre de la receta debe ser menor a 30 caracteres";
		}
		if(price < 8000) {
			return "El precio debeser mayor a $8.000";
		}
		
		Recipe recipe = new Recipe(id, name, price);
		boolean result = recipeRepository.createRecipe(recipe);
		
		if (result) {
			System.out.println("");
			return "La receta se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error al crear la receta";
		}
		
		
	}
	
	public ArrayList<Recipe> getAll() {
		ArrayList<Recipe> recipes = recipeRepository.getRecipes();
		return recipes;
	}
	
	public Recipe searchRecipe(String id) {
		Recipe recipe = recipeRepository.findRecipeById(id);
		return recipe;
	}
	
	public String updateRecipes(Recipe recipe, String id, String name, double price) {
		
		Recipe updateRecipe = new Recipe(id ,name, price);
		recipeRepository.updateRecipe(recipe, updateRecipe);
		return null;
		
	}
	
	public boolean deleteRecipe(String id) {
		return recipeRepository.deleteRecipe(id);
		
	}
	
	

}

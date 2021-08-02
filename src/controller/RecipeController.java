package controller;

import java.util.ArrayList;

import data.RecipeRepository;

import models.Recipe;

public class RecipeController {
	
	RecipeRepository recipeRepository = new RecipeRepository();
	
	
	public String createRecipe(String name, double price) {
		
		if(name.trim().length() <= 4) {
			return "El nombre de la receta debe ser mayor a 4 caracteres";
		}
		if(price < 8000) {
			return "El precio debeser mayor a $8.000";
		}
		
		Recipe recipe = new Recipe(name, price);
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
	
	public Recipe searchRecipe(String name) {
		Recipe recipe = recipeRepository.findRecipeById(name);
		return recipe;
	}
	
	

}

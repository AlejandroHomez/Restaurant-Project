package data;

import java.util.ArrayList;

import models.Product;
import models.Recipe;

public class RecipeRepository {
	
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	
	public boolean createRecipe(Recipe recipe) {
		
		recipes.add(recipe);
		return true;
		
	}
	
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}
	
	public Recipe findRecipeById(String id) {
		for(int i = 0 ; i < recipes.size() ; i++ ) {
			Recipe recipe = recipes.get(i);
			
			if (recipe.getId().equals(id)) {
				return recipe;
			}
		}
		return null;
	}
	
	public boolean updateRecipe(Recipe recipe, Recipe updateRecipe) {
		
		int position = recipes.indexOf(recipe);
		
		recipes.set(position, updateRecipe);
		
		return true;
	}
	
	public boolean deleteRecipe(String id) {
		for(int i = 0 ; i < recipes.size(); i++) {
			Recipe recipe = recipes.get(i);
			if(recipe.getId().equals(id)) {
				recipes.remove(i);
				return true;
			}
		}
		return false;
	}

}

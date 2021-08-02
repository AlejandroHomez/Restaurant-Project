package data;

import java.util.ArrayList;

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
	
	public Recipe findRecipeById(String name) {
		for(int i = 0 ; i < recipes.size() ; i++ ) {
			Recipe recipe = recipes.get(i);
			
			if (recipe.getName().equals(name)) {
				return recipe;
			}
		}
		return null;
	}

}

package data;

import java.util.ArrayList;

import models.Recipe;

public class RecipeRepository {
	
	private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	
	public boolean createRecipe(Recipe recipe) {
		
		recipes.add(recipe);
		return true;
		
	}

}

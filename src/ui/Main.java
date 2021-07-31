package ui;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("INICIO DEL PROGRAMA");
		System.out.println("");
		
		
		ClientsScreen clientsScreen = new ClientsScreen();
		clientsScreen.createClient();
		
		ProductScreen productScreen = new ProductScreen();
		productScreen.createProducto();
		
		RecipeScreen recipeScreen = new RecipeScreen();
		recipeScreen.createRecipe();
		
		TableScreen tableScreen = new TableScreen();
		tableScreen.crateTable();
		
		
	}
	
}






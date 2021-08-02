package ui;


public class Main {

	public static void main(String[] args) {
		
		MenuScreen menuScreen = new MenuScreen();
		ClientsScreen clientsScreen = new ClientsScreen();
		ProductScreen productScreen = new ProductScreen();
		RecipeScreen recipeScreen = new RecipeScreen();
		TableScreen tableScreen = new TableScreen();
		
		System.out.println("INICIO DEL PROGRAMA");
		System.out.println("");
		
		while(true) {
			int selected = menuScreen.showMenuOptions();
			
			switch(selected) {
			
			//Clients
			case 1:
				clientsScreen.createClient();
				break;
			case 2:
				clientsScreen.listClients();
				break;
			case 9:
				clientsScreen.seachClient();
				break;
			
				
			//Products
			case 3:
				productScreen.createProducto();
				break;
			case 4:
				productScreen.listProducts();
				break;
			case 10:
				productScreen.searchProduct();
				break;
				
			//Recipes
			case 5:
				recipeScreen.createRecipe();
				break;
			case 6:
				recipeScreen.listRecipes();
				break;
			case 11:
				recipeScreen.searchRecipe();
				break;
				
			//Tables
			case 7:
				tableScreen.crateTable();
				break;
			case 8:
				tableScreen.listTables();
				break;
			case 12:
				tableScreen.searchTable();
				break;
				
			
			default:
				System.out.println("******************************************");
				System.out.println("La opcion seleccionada no esta disponible");
				System.out.println("******************************************");
				
			}
			
			
		}
		
		
		
	
		
		
		
		
		
		
		
	}
	
}






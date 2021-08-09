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
				
			int selected = menuScreen.showMenuOptionsPrincipal();
			
			
			switch(selected) {
	
			//Clients
			case 1:
				int selectedClient = menuScreen.showMenuOptionsClients();
				switch(selectedClient) {
				case 1: clientsScreen.createClient();break;
				case 2: clientsScreen.listClients();break;
				case 3: clientsScreen.seachClient();break;
				case 4: clientsScreen.updateclient();break;
				case 5: clientsScreen.deleteClient();break;
				case 6: menuScreen.showMenuOptionsPrincipal();break;
				default:menuScreen.showMenuOptionsClients();
				}
				break;
				
			//Products
			case 2:
				int selectedProduct = menuScreen.showMenuOptionsProducts();
				switch(selectedProduct) {
				case 1: productScreen.createProduct();break;
				case 2: productScreen.listProducts();break;
				case 3: productScreen.searchProduct();break;
				case 4: productScreen.updateProduct();break;
				case 5: productScreen.deleteProduct();;break;
				case 6: menuScreen.showMenuOptionsPrincipal();break;
				default:menuScreen.showMenuOptionsProducts();
				}
				
				break;
			case 3:
				int selectedRecipe = menuScreen.showMenuOptionsRecipes();
				switch(selectedRecipe) {
				case 1: recipeScreen.createRecipe();break;
				case 2: recipeScreen.listRecipes();break;
				case 3: recipeScreen.searchRecipe();break;
				case 4: recipeScreen.updateRecipe();break;
				case 5: recipeScreen.deleteRecipe();break;
				case 6: menuScreen.showMenuOptionsPrincipal();break;
				default:menuScreen.showMenuOptionsRecipes();
				
				}
				break;
			case 4:
				int selectedTable = menuScreen.showMenuOptionsTables();
				switch(selectedTable) {
				case 1: tableScreen.crateTable();break;
				case 2: tableScreen.listTables();break;
				case 3: tableScreen.searchTable();break;
				case 4: tableScreen.updateTable();break;
				case 5: tableScreen.deleteTable();break;
				case 6: menuScreen.showMenuOptionsPrincipal();break;
				default:menuScreen.showMenuOptionsTables();
				}
				break;
				
			default:
				System.out.println("******************************************");
				System.out.println("La ejecucion del programa ha finalizado");
				System.out.println("******************************************");
				System.exit(0);
				
			}
			
		}
		
	}
	
}






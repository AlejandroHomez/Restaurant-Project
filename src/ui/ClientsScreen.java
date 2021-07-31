package ui;

import java.util.Scanner;

import controller.ClientController;

public class ClientsScreen {

	ClientController clientController = new ClientController();
	
	public void createClient() {
		
		String name;
		String lastName;
		String identityDocument;
		boolean hasChildren;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("----------------CREAR CLIENTES----------------");
		System.out.println("");
		
		System.out.println("Ingrese el nombre: ");
		name = sc.nextLine();
		System.out.println("Ingrese el Apellido: ");
		lastName = sc.nextLine();
		System.out.println("Ingrese el Documento de identidad: ");
		identityDocument = sc.nextLine();
		System.out.println("El cliente tiene hijos y/n : ");
		String hasChildrenString = sc.nextLine();
		
		if(hasChildrenString.toLowerCase().equals("y")) {
			hasChildren = true;
		} else {
			hasChildren = false;
		}
		
		String result = clientController.createClient(name, lastName, identityDocument, hasChildren);
		System.out.println(result);

		
		
	}

}

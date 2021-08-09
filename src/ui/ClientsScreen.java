package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ClientController;
import models.Client;

public class ClientsScreen {

	ClientController clientController = new ClientController();
	
	public void createClient() {
		
		String name;
		String lastName;
		String identityDocument;
		boolean hasChildren;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("----------------CREAR CLIENTES----------------");
		System.out.println("");
		
		System.out.println("Ingrese el nombre: ");
		name = sc.nextLine();
		System.out.println("Ingrese los apellidos: ");
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
	
	public void listClients() {
		
		ArrayList<Client> clients = clientController.getClients();
		
		if (clients.size() == 0) {
			System.out.println("No hay clientes creados en la base de datos");
			return;
		}
	
		
		for (int i = 0 ; i < clients.size(); i++ ) {
			Client client = clients.get(i);
			System.out.println(client.toString());
		}
		
	}
	
	public void seachClient() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un documento de identidad para buscar");
		String id = sc.nextLine();
		
		Client client = clientController.searchClient(id);
		
		if (client != null) {
			System.out.println(client.toString());
		} else {
			System.out.println("No se encuenta el cliente");
			
		}
		
	}
	
	public void updateclient() {
		
		Scanner scUpdate = new Scanner(System.in);
		System.out.println("Digite el documento del cliente que desea actualizar:");
		String id = scUpdate.nextLine();
		
		Client client = clientController.searchClient(id);
		
		if (client != null) {
			
			String name;
			String lastName;
			String identityDocument;
			boolean hasChildren;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("----------------ACTUALIZAR CLIENTE----------------");
			System.out.println("Ingrese el nombre: ");
			name = sc.nextLine();
			System.out.println("Ingrese los apellidos: ");
			lastName = sc.nextLine();
			System.out.println("Ingrese el documento de identidad: ");
			identityDocument = sc.nextLine();
			System.out.println("El cliente tiene hijos y/n : ");
			String hasChildString = sc.nextLine();
					
			if (hasChildString.toLowerCase().equals("y")) {
				hasChildren = true;
			} else {
				hasChildren = false;
			}
	
			String result = clientController.updateClient(client, name, lastName, identityDocument, hasChildren);
			
			System.out.println("Se actualizó el cliente con exito");
		} else {
			System.out.println("No se encontró el cliente con el documento: " + id);
		}
	}
	
	
	public void deleteClient() {
		
		Scanner scDeleted = new Scanner(System.in);
		System.out.println("Ingrese el documento del cliente que desea eliminar:");
		String id = scDeleted.nextLine();
		
		Boolean clientDeleted = clientController.deleteClient(id);
		
		if (clientDeleted) {
			System.out.println("Se eliminó el cliente con exito");
		} else {
			System.out.println("No se encontró el cliente con el documento: " + scDeleted);
		}
	}
		
	
}

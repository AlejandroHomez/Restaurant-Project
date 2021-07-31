package controller;

import data.ClientRepository;
import models.Client;

public class ClientController {
	
	ClientRepository clientRepository = new ClientRepository();
	
	public String createClient(String name, String lastName, String identityDocument, boolean hasChildren) {
		
		if(name.trim().length() <= 3) {
			return "El nombre no puede tener menos de 3 caracteres";
		}
		if(lastName.trim().length() <= 3) {
			return "El Apellido no puede tener menos de 3 caracteres";
		}
		if(identityDocument.trim().length() <= 5) {
			return "El Documento de identidad no puede ser menor a 5 digitos";
		}
		
		Client client = new Client(name, lastName, identityDocument, hasChildren);
		
		boolean result = clientRepository.create(client);
		
		if (result) {
			System.out.println("");
			return "El cliente se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error en los datos al crar el cliente";
		}
		
	}

}

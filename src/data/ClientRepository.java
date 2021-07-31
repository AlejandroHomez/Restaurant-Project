package data;

import java.util.ArrayList;

import models.Client;

public class ClientRepository {
	
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public boolean create(Client client) {
		
		clients.add(client);
		
		return true;
		
	}

	

}

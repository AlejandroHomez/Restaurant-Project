package data;

import java.util.ArrayList;

import models.Client;

public class ClientRepository {
	
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public boolean create(Client client) {
		
		clients.add(client);
		return true;
	}
	
	public ArrayList<Client> getAll(){
		return clients;
	}
	
	public Client findClientById(String id) {
		
		for (int i = 0 ; i < clients.size(); i ++) {
			
			Client client = clients.get(i);
			
			if(client.getIdentityDocument().equals(id)) {
				
				return client;
			} 
		}
		
		return null;
	}

	

}

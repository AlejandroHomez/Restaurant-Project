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
	
	public boolean updateClient(Client client, Client clientUpdate) {
		
		int position = clients.indexOf(client);
		
		clients.set(position,clientUpdate);
		
		return true;
	}
	
	public boolean deleteClient(String id) {
		for(int i = 0 ; i < clients.size(); i++) {
			Client client = clients.get(i);
			if(client.getIdentityDocument().equals(id)) {
				clients.remove(i);
				return true;
			}
		}
		
		return false;
		
	}


}

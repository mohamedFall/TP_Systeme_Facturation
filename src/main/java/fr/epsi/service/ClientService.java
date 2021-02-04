package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientService {
	
	void addClient(Client client);
	
	List<Client> getListClients();
	
}

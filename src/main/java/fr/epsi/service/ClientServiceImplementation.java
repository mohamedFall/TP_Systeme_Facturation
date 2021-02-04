package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ClientDao;
import fr.epsi.dao.ClientDaoImplementation;
import fr.epsi.entite.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImplementation implements ClientService {

	@PersistenceContext
	private EntityManager em;
	
	@Resource
	private UserTransaction utx;

	public void addClient(Client client) {	
		ClientDao clientDao = new ClientDaoImplementation(em, utx);
		clientDao.add(client);
	}

	public List<Client> getListClients() {
		ClientDao clientDao = new ClientDaoImplementation(em, utx);
		return clientDao.getListClients();
	}
	
}

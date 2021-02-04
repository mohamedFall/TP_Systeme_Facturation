package fr.epsi.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public class LigneFactureDaoImplementation implements LigneFactureDao {
	
	/*private EntityManager em;
	private UserTransaction utx;

	public LigneFactureDaoImplementation (EntityManager em, UserTransaction utx) {
		this.em = em;
		this.utx = utx;
	}*/

	public void add(LigneFacture lfacture) {
		
	}

	public List<LigneFacture> getListLignesFacture(Facture facture) {
		
		/*return em.createQuery("SELECT lf FROM LigneFacture lf WHERE lf.facture_id = :facture_id", LigneFacture.class)
				.setParameter("facture_id", facture.getId())
				.getResultList();*/
		
		return null;
		
	}
	
	
}

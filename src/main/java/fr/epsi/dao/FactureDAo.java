package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureDAo {
	
	void add(Facture facture);
	
	List<Facture> getListFactures();
	
	List<Facture> getMockListFactures();
	
}

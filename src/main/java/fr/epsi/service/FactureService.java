package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureService {
	
	void addFacture(Facture facture);
	
	List<Facture> getListFactures();
	
	List<Facture> getMockListFactures();
	
}

package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.LigneFacture;

public interface LigneFactureService {
	
	void addLigneFacture(LigneFacture lfacture);
	
	List<LigneFacture> getListLignesFacture();
	
}

package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public interface LigneFactureDao {
	
	void add(LigneFacture lfacture);
	
	List<LigneFacture> getListLignesFacture(Facture facture);
	
}

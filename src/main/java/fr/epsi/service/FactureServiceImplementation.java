package fr.epsi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImplementation implements FactureService {

	public void addFacture(Facture facture) {
		// TODO Auto-generated method stub
		
	}

	public List<Facture> getListFactures() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public List<Facture> getMockListFactures() {
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		List<Facture> listFactures = new ArrayList<Facture>();

		LigneFacture lfacture1 = new LigneFacture();
		
		Article article = new Article();
		article.setNom("Clé USB");
		article.setCodeBarre("cb-11234");
		article.setPrix(50.99);
		
		lfacture1.setArticle(article);
		lfacture1.setQte((long) 2);
		lfacture1.setPrix(article.getPrix());
		
		Facture facture1 = new Facture();
		lfacture1.setFacture(facture1);
		
		Client client1 = new Client();
		client1.setNom("DUPONT");
		client1.setAdresse("Marseille");
		
		facture1.setClient(client1);
		try {
			facture1.setDate(DateFor.parse("28/01/2020"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		facture1.setPrix(lfacture1.getPrix());
		
		listFactures.add(facture1);
		
		return listFactures;
	}

}

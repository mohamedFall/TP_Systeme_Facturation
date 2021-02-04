package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LigneFacture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Article article;
	private Long qte;
	private Double prix;
	@ManyToOne
	private Facture facture;
	
	public Long getQte() {
		return qte;
	}
	
	public void setQte(Long qte) {
		this.qte = qte;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = article.getPrix() * this.qte;
	}
	
	public Article getArticle() {
		return article;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}
}

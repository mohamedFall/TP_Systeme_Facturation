package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImplementation;
import fr.epsi.dao.ClientDao;
import fr.epsi.dao.ClientDaoImplementation;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImplementation implements ArticleService {

	@PersistenceContext
	private EntityManager em;
	
	@Resource
	private UserTransaction utx;

	public void addArticle(Article article) {
		ArticleDao articleDao = new ArticleDaoImplementation(em, utx);
		articleDao.add(article);
	}

	public List<Article> getListArticles() {
		ArticleDao articleDao = new ArticleDaoImplementation(em, utx);
		return  articleDao.getListArticles();
	}
	
}

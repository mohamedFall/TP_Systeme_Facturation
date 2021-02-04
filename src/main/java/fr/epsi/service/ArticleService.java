package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Article;

public interface ArticleService {
	
	void addArticle(Article article);
	
	List<Article> getListArticles();
	
}

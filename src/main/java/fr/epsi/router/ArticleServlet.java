package fr.epsi.router;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Article;
import fr.epsi.service.ArticleService;

public class ArticleServlet extends HttpServlet {

	@EJB
	private ArticleService articleService;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameterMap().containsKey("action")) {
			if (req.getParameter("action").equals("create")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/createArticle.jsp").forward(req, resp);
			}
		} else {
			req.setAttribute("listArticles", articleService.getListArticles());
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/articles.jsp").forward(req, resp);
		}

	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   Article article = new Article();
		   article.setNom(req.getParameter("nom"));
		   article.setCodeBarre(req.getParameter("code_barre"));
		   article.setPrix(Double.parseDouble(req.getParameter("prix")));
		   
		   
		   articleService.addArticle(article);
		   
		   req.setAttribute("listArticles", articleService.getListArticles());
		   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/articles.jsp").forward(req, resp);
	    }

}

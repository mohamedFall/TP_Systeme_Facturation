package fr.epsi.router;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;

public class FactureServlet extends HttpServlet {
	
	@EJB
	private FactureService factureService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("listFactures", factureService.getMockListFactures());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/factures.jsp").forward(req, resp);
	}

}

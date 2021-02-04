package fr.epsi.router;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Client;
import fr.epsi.service.ClientService;

public class ClientServlet extends HttpServlet {
	
	@EJB
	private ClientService clientService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameterMap().containsKey("action")) {
			if (req.getParameter("action").equals("create")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/createClient.jsp").forward(req, resp);
			}
		}
		else {
			req.setAttribute("listClients", clientService.getListClients());
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/clients.jsp").forward(req, resp);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		   Client client = new Client();
		   client.setNom(req.getParameter("nom"));
		   client.setAdresse(req.getParameter("adresse"));
		   
		   
		   clientService.addClient(client);
		   
		   req.setAttribute("listClients", clientService.getListClients());
		   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/clients.jsp").forward(req, resp);
	    }

}

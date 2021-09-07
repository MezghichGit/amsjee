package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProduitServlet
 */
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		// construire un flux de sortie
		PrintWriter out = response.getWriter();
		// envoi de la page générée
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Liste de produits</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Liste des produits</H1>");
		out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		// construire un flux de sortie
		PrintWriter out = response.getWriter();
		String libelle = request.getParameter("libelle");
		String prix = request.getParameter("prix");
		
		// ici partie dao, jdbc
		
		
		// envoi de la page générée
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Liste de produits</TITLE></HEAD>");
		out.println("<BODY>");
		out.println(libelle+" "+prix);
		out.println("<H1>Ajout avec succès!</H1>");
		out.println("</BODY></HTML>");
	}

}
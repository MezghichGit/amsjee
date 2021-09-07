package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProduitDAO;
import entities.Produit;

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
		
		List<Produit> produits=null;
		response.setContentType("text/html");
		// construire un flux de sortie
		PrintWriter out = response.getWriter();
		
		ProduitDAO dao = new ProduitDAO();
		
		try {
			produits = dao.getAll();
			
			System.out.println(produits);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// redirection vers la listproduit.jsp
		
		request.setAttribute("data", produits);
		RequestDispatcher rd = request.getRequestDispatcher("listproduits.jsp");
		rd.forward(request, response);
		// envoi de la page générée
		//out.println("<HTML>");
		//out.println("<HEAD><TITLE>Liste de produits</TITLE></HEAD>");
		//out.println("<BODY>");
		//out.println("<H1>Liste des produits</H1>");
		//out.println("</BODY></HTML>");
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
		
		ProduitDAO dao = new ProduitDAO();
		
		try {
			dao.create(new Produit(libelle, Double.parseDouble(prix)));
		} catch (NumberFormatException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet( request,  response);
		
		//RequestDispatcher rd = request.getRequestDispatcher("listproduits.jsp");
		//rd.forward(request, response);
		// ici partie dao, jdbc
		
		
		// envoi de la page générée
		/*out.println("<HTML>");
		out.println("<HEAD><TITLE>Liste de produits</TITLE></HEAD>");
		out.println("<BODY>");
		out.println(libelle+" "+prix);
		out.println("<H1>Ajout avec succès!</H1>");
		out.println("</BODY></HTML>");**/
	}

}

package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProduitDAO;
import entities.Produit;

/**
 * Servlet implementation class UpdateProduit
 */
public class UpdateProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProduit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int idProd = Integer.parseInt(request.getParameter("id"));
		
		//Récupération de l'objet qu'on veut modifier
		
		ProduitDAO dao = new ProduitDAO();
		Produit target =null;
		try {
			target = dao.getProduit(idProd);
			System.out.println(target);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Suppression avec succès");
		
		//ProduitServlet ps = new ProduitServlet();
		response.sendRedirect(request.getContextPath() +"/updateProduit.jsp" );
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

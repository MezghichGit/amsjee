package dao;
import java.sql.*;
import config.*;

import entities.Produit;
public class ProduitDAO {
	
	public  void create(Produit produit) throws ClassNotFoundException
	{
		try {
			Statement stmt = Util.open();
			stmt.executeUpdate("insert into produit(libelle,prix) values('"+produit.getLibelle()+"','"+produit.getPrix()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				Util.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

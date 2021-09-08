package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
	
	public  List<Produit> getAll() throws ClassNotFoundException
	{
		List<Produit>lp = new ArrayList<>();;
		
		try {
			Statement stmt = Util.open();
			ResultSet rs = stmt.executeQuery("select * from produit");
			
			while (rs.next()) {
				Produit p = new Produit(rs.getInt("id"),rs.getString("libelle"),rs.getDouble("prix"));
				lp.add(p);
			}
			
			
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
			
	
		return lp;
		
	}
	
	
	
	
	public  void delete(int id) throws ClassNotFoundException
	{
		try {
			Statement stmt = Util.open();
			stmt.executeUpdate("delete from produit where id='"+id+"'");
			//System.out.println("Delete");
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
	
	public  Produit getProduit(int id) throws ClassNotFoundException
	{
		Produit p=null;
		
		try {
			Statement stmt = Util.open();
			ResultSet rs = stmt.executeQuery("select * from produit where id='"+id+"'");
			
			while (rs.next()) {
				p = new Produit(rs.getInt("id"),rs.getString("libelle"),rs.getDouble("prix"));
			}
			
			
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
			
	
		return p;
		
	}
	

}

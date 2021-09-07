<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="entities.Produit"%>   
 <%@ page import="java.util.ArrayList"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste de produits</title>
</head>
<body>
<h1 align="center">Liste des produits</h1>

<table align="center" border="1">

<tr><th>ID</th><th>Libelle</th><th>Prix</th><th>Supprimer</th><th>Modifier</th></tr>
<% ArrayList<Produit> produits = (ArrayList<Produit>)request.getAttribute("data"); 
for(Produit p : produits){ %>
<tr>
	<td><%=p.getId() %></td>
	<td><%=p.getLibelle() %></td>
	<td><%=p.getPrix() %></td>
	<td><a href="DeleteProduit?id=<%=p.getId() %>">Supprimer</a></td>
	<td><a href="#">Mettre à jour</a></td>
</tr>
<% } %>
</table>

</body>
</html>
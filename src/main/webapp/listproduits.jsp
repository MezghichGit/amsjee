<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="entities.Produit"%>   
 <%@ page import="java.util.ArrayList"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Liste de produits</title>
</head>
<body>
<h1 align="center">Liste des produits</h1>

<table align="center"  class="table table-borderd table-stripped">

<tr><th>ID</th><th>Libelle</th><th>Prix</th><th>Supprimer</th><th>Modifier</th></tr>
<% ArrayList<Produit> produits = (ArrayList<Produit>)request.getAttribute("data"); 
for(Produit p : produits){ %>
<tr>
	<td><%=p.getId() %></td>
	<td><%=p.getLibelle() %></td>
	<td><%=p.getPrix() %></td>
	<td><a class="btn btn-danger" href="DeleteProduit?id=<%=p.getId() %>">Supprimer</a></td>
	<td><a class="btn btn-warning" href="UpdateProduit?id=<%=p.getId() %>">Mettre à jour</a></td>
</tr>
<% } %>
</table>

</body>
</html>
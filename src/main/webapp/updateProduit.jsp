<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Mise à jour d'un produit</h1>
<form action="ProduitServlet" method="POST">
	
	<table align="center">
	<tr><td>Libelle :</td><td><input type="text" name="libelle" /></td></tr>
	<tr><td>Prix :</td><td><input type="text" name="prix" /></td></tr>
	<tr><td></td><td><input class="btn btn-warning"
			type="submit" value="Mettre à jour" /></td></tr>
	</table>
	</form>
</body>
</html>
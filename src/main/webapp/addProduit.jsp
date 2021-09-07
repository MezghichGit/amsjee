<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter Produit</title>
</head>
<body>
	<h1 align="center">Ajouter un nouveau produit</h1>

	<form action="ProduitServlet" method="POST">
		Libelle :<input type="text" name="libelle" /> <br /> Prix :<input
			type="text" name="prix" /> <br /> <input type="submit"
			value="Ajouter" />

	</form>
</body>
</html>
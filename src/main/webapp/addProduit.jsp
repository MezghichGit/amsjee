<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
	margin: 20px;
}
</style>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<title>Ajouter Produit</title>
</head>
<body>
	<h1 align="center">Ajouter un nouveau produit</h1>

	<form action="ProduitServlet" method="POST">
	
	<table>
	<tr><td>Libelle :</td><td><input type="text" name="libelle" /></td></tr>
	<tr><td>Prix :</td><td><input type="text" name="prix" /></td></tr>
	<tr><td></td><td><input class="btn btn-primary"
			type="submit" value="Ajouter" /></td></tr>
	</table>
	</form>
</body>
</html>
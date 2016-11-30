<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<table border=1>
	<tr>
	<th>Código</th><th>Imagem</th><th>Excluir</th>
	</tr>
	<c:forEach var="i" begin="0" end="${carrinho.indice - 1}">
	<tr>
		<td>${carrinho.itens[i]}</td> 
	<c:choose><c:when test="${carrinho.itens[i] == 1}">
		<td><img src="imagens/um.jpg" width="50" height="50"></td> <td><a href="excluir?id=1"> Excluir </a> </td>
	
	</c:when><c:when test="${carrinho.itens[i] == 2}">
		<td><img src="imagens/dois.jpg" width="50" height="50"></td> <td> <a href="excluir?id=2"> Excluir </a> </td>
	</c:when><c:when test="${carrinho.itens[i] == 6}">
		<td><img src="imagens/seis.jpg" width="50" height="50"></td> <td> <a href="excluir?id=6"> Excluir </a> </td>
	</c:when><c:when test="${carrinho.itens[i] == 8}">
		<td><img src="imagens/oito.jpg" width="50" height="50"></td> <td><a href="excluir?id=8"> Excluir </a> </td>
	</c:when></c:choose></tr></c:forEach>
</table>
<br>
<a href="index.html">Comprar mais</a></body></html>
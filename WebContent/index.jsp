<%@page import ="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Connexion </title>
</head>
<body>

<form action="ServeletCtr" method="post">

	Login :         <input type ="text" name="login" placeholder="login"><br>
	
	Mot de Passe : <input type = "text" name="password" placeholder="paswword"><br>
	
	<input type="submit" value=Connexion >



</form>
</body>
</html>
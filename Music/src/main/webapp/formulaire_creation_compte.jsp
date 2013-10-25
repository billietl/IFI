<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body>
	<jsp:include page="fucking_pub.jsp"/>
	<h1>Le formulaire d'inscription de noob :</h1>
	<center>
		<form method="POST" action="service_creation_compte_ici"
			enctype="x-www-form-urlencoded">
			Pseudo : <input type="text" name="login" /><br /> Adresse e-mail : <input
				type="text" name="email" /><br /> Mot de passe : <input
				type="password" name="passwd" /><br /> Confirmez le mot de passe : <input
				type="password" name="passwd_bis" /><br /> <input type="submit"
				value="CREATION !!!" />
		</form>
	</center>
</body>
</html>

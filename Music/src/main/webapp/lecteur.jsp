<%
	if(session.getAttribute("sessionID") == null)
%>
	<jsp:forward page="formulaire_connection.jsp"/>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body>
	<jsp:include page="import/fucking_pub.jsp"/>
	<div id="lecteur audio">
		<h1>Lecteur</h1>
		<p>Pour le lecteur en lui m&ecirc;me, on va utiliser <a href="http://www.alsacreations.fr/dewplayer.html">dewplayer</a>.</p>
	</div>
	<div id="liste lecture">
		<h1>Liste lecture</h1>
		<p>Pour chaque piste disponible, un clic modifiera dewplayer pour jouer la piste audio.</p>
		<p>On acc&egrave;dera a la piste audio via REST (ou autre).</p>
	</div>
</body>
</html>

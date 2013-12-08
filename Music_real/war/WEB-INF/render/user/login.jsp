<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/render/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body>
	<jsp:include page="../fucking_pub.jsp" />
	<h2>Le formulaire de connexion de madame :</h2>
	<form:form id="formulaire" method="post" commandName="loginUser" >
		Pseudo : 
			<form:input path="pseudo" /><form:errors path="pseudo" cssClass="error"/>
			<br />
		Mot de passe :
			<form:password path="passwd" /><form:errors path="passwd" cssClass="error"/>
			<br />
		<input type="submit" value="CONNEXION !!!" />
	</form:form>
</body>
</html>

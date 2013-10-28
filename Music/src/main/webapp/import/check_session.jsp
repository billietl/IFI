<%
	if(session.getAttribute("sessionID") != null){
		response.sendRedirect("formulaire_connection.jsp");
		return;
	}
%>
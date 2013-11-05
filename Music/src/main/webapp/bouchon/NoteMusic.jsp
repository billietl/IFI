<%if(session.getAttribute("sessionID") != null){return;}%><%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%><% 
	int note = Integer.parseInt(request.getParameter("note"));
	int music_id = Integer.parseInt(request.getParameter("mid"));
	out.print("0");
/*faire des galipettes ici*/
%>

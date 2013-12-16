<%@ page language="java" contentType="application/json"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/render/include.jsp" %>
<%= request.getParameter("callback") %>({"list":[
	<c:forEach items="${list}" var="i" begin="0" end="0">
	{
	"id":"<c:out value="${i.id}"/>",
	"Artiste":"<c:out value="${i.artiste}"/>",
	"Titre":"<c:out value="${i.titre}"/>",
	"moy":"<c:out value="${i.moyenne}"/>"
	}
	</c:forEach>
	<c:forEach items="${list}" var="i" begin="1">
	,{
	"id":"<c:out value="${i.id}"/>",
	"Artiste":"<c:out value="${i.artiste}"/>",
	"Titre":"<c:out value="${i.titre}"/>",
	"moy":"<c:out value="${i.moyenne}"/>"
	}
	</c:forEach>
]});
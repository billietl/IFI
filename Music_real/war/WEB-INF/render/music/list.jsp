<%@ page language="java" contentType="application/json"
	pageEncoding="US-ASCII"%>
<%@ include file="/WEB-INF/render/include.jsp" %>
<%= request.getParameter("callback") %>(
{"list":[
	
	{
	"id":"0",
	"Artiste":"Justin Bieber",
	"Titre":"Baby",
	"moy":"0"
	},
	{
	"id":"1",
	"Artiste":"Red Hot Chili Peppers",
	"Titre":"Scar Tissue",
	"moy":"5"
	},
	{
	"id":"2",
	"Artiste":"Soul Grind",
	"Titre":"Farewell to misery",
	"moy":"4"
	}
]}
);
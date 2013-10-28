<%@ page language="java" contentType="application/json" pageEncoding="UTF-8"%>
<%if(session.getAttribute("sessionID") != null){return;}%>
{ "list":[
	{
		"artiste": "Interpol",
		"titre": "Slow Hands"
	},
	{
		"artiste": "Soulgrind",
		"titre": "Farewell to misery"
	},
	{
		"artiste": "Red Hot Chili Pepper",
		"titre": "Scar Tissue"
	},
	{
		"artiste": "Skid Row",
		"titre": "Monkey Business"
	}
]}
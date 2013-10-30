<%if(session.getAttribute("sessionID") != null){return;}%>
<%= request.getParameter("callback") %>(
{"list":[
	{"id":"1","Artiste":"Interpol","Titre":"Slow Hands","moy":"4"},
	{"id":"2","Artiste":"Soulgrind","Titre":"Farewell to misery","moy":"5"},
	{"id":"3","Artiste":"Red Hot Chili Pepper","Titre":"Scar Tissue","moy":"5"},
	{"id":"4","Artiste":"Skid Row","Titre":"Monkey Business","moy":"3"},
	{"id":"5","Artiste":"Justin Bieber","Titre":"Baby","moy":"0"}
]}
);